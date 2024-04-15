package com.tak.waterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }
}

/**
 * 뭘하고싶냐면
 * 1. 정수기를 쓸때, 지금 물 조절하는게 120ml, 250ml, 500ml, 1000ml, 자동(그냥 계속 나오는거) 이렇게 밖에 컨트롤이 안됨
 * 2. 근데 나는 컵 사이즈에 맞춰서 자동으로 물 조절되게하는 것을 원함
 * 3. 어떻게 할거냐? 물이 떨어질때 처음 떨어질때의 소리와 컵이 점점 다 차게될때의 소리가 다른 것을 이용
 *
 * 그래도 이미지로 가시적으로 좀 보여주는게 좋지 않을까?
 * 임의의 크기가 n 인 컵이 있다고 가정하고 (100ml 이상 채울 수 있다고 가정하고)
 */