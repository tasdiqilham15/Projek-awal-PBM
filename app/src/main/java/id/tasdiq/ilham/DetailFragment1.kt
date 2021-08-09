package id.tasdiq.ilham

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.tasdiq.ilham.databinding.FragmentDetail1Binding

class DetailFragment1 : Fragment() {
    private var _binding: FragmentDetail1Binding? = null
    private val binding get() = _binding!!

    var displayText: String? = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetail1Binding.inflate(inflater, container, false)
        val view = binding.root

        displayText = arguments?.getString("message")

        binding.displayText1.text = displayText

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}