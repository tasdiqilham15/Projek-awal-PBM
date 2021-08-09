package id.tasdiq.ilham

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import id.tasdiq.ilham.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val daftarFragment = DaftarFragment()
        val fragment =
            supportFragmentManager.findFragmentByTag(DaftarFragment::class.java.simpleName)

        binding.buttonOpenFragment.setOnClickListener {
            if (fragment !is DaftarFragment) {
                binding.buttonOpenFragment.visibility = View.GONE
                supportFragmentManager.beginTransaction()
                    .add(R.id.daftar, daftarFragment, DaftarFragment::class.java.simpleName)
                    .commit()
            }
        }
    }

    override fun passData(textView: String) {
        val budle = Bundle()

        budle.putString("message", textView)

        val detailFragment = DetailFragment()
        detailFragment.arguments = budle
        supportFragmentManager.beginTransaction()
            .add(R.id.daftar, detailFragment, DaftarFragment::class.java.simpleName)
            .addToBackStack(DaftarFragment::class.java.simpleName)
            .commit()
    }

    override fun passData1(textView: String) {
        val budle = Bundle()

        budle.putString("message", textView)

        val detailFragment1 = DetailFragment1()
        detailFragment1.arguments = budle
        supportFragmentManager.beginTransaction()
            .add(R.id.daftar1, detailFragment1, DaftarFragment::class.java.simpleName)
            .addToBackStack(DaftarFragment::class.java.simpleName)
            .commit()
    }
}

