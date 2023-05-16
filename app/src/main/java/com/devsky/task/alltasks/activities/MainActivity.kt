package com.devsky.task.alltasks.activities

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.devsky.task.alltasks.MyViewModel
import com.devsky.task.alltasks.databinding.ActivityMainBinding
import com.devsky.task.alltasks.displayoverapps.Window


class MainActivity : AppCompatActivity() {
    private val tag: String = javaClass.simpleName
    private var binding: ActivityMainBinding? = null
    private val viewModel: MyViewModel by viewModels()
    private lateinit var window: Window

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initObservers()

        viewModel.startCounter()
        checkOverlayPermission()

        binding!!.btnCanvas.setOnClickListener{
            startActivity(Intent(this@MainActivity,CanvasActivity::class.java))
        }
        window = Window(this)



        binding!!.btnShowScreenOver.setOnClickListener{
            window.open()
        }
    }
    fun checkOverlayPermission() {
        if (!Settings.canDrawOverlays(this)) {
            val myIntent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
            startActivity(myIntent)
        }
    }
    private fun initObservers() {
        Log.i(tag, "registering Observers: ViewModel? $viewModel")
        viewModel.currentCounter.observe(this) { value ->
            Log.i(tag, "inserting value")
            binding?.value?.text = value.toString()
        }
    }
    private fun closeObservers() {
        Log.i(tag, "registering Observers: ViewModel? $viewModel")
        viewModel.currentCounter.removeObservers (this)
    }
}