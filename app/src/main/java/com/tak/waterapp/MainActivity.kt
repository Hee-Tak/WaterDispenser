package com.tak.waterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tak.waterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding = ActivityMainBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
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
 *
 * 물따르는 소리 mp3 파일을 임의로 받아서 그거 첫소리랑 끝소리 분석하고 뭐 안될라나
 *
 * 아니면 첫소리부터 따르는거까지 분석해서 ...하는거
 * 그니까 첫소리부터 따르는거까지 들리는 mp3 파일에서 좀 더 늘려가지고 일부러.
 * 그리고 얘가 이제 컵이 full 이라는 것을 인식을 하면, 알아서 mp3 파일을 꺼버리게. 그렇게할까
 * https://sh-itstory.tistory.com/62
 * 이거 링크 참고
 *
 *
 * 초월 시뮬 생각중
 * 한 칸을 이미지뷰로 해야겠는걸
 *
 */




