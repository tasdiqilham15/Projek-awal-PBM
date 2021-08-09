package id.tasdiq.ilham

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.tasdiq.ilham.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    var displayText: String? = ""
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        displayText = arguments?.getString("message")

        binding.displayText.text = displayText

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}