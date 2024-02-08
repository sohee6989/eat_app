package com.gdsc_android.eat_app

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setBottomNavigationView()

        // 앱 초기 실행 시 홈화면으로 설정
        if (savedInstanceState == null) {
            binding.bottomNavigationView.selectedItemId = R.id.fragment_home
        }
    }

    fun setBottomNavigationView() {
        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.fragment_find_amount -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container, FindAmoutFragment()).commit()
                    true
                }
                R.id.fragment_record -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container, RecordFragment()).commit()
                    true
                }
                R.id.fragment_view_record -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container, ViewRecordFragment()).commit()
                    true
                }
                R.id.fragment_my -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container, MyFragment()).commit()
                    true
                }
                else -> false
            }
        }
    }





}