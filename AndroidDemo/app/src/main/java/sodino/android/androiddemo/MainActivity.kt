package sodino.android.androiddemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sodino.android.androiddemo.databinding.ActivityMainBinding
import sodino.cpp.NativeLib

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
//        binding.sampleText.text = stringFromJNI()
        binding.sampleText.text = NativeLib().helloWorld()
    }
}