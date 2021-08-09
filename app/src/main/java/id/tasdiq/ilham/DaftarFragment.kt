package id.tasdiq.ilham

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.tasdiq.ilham.databinding.FragmentDaftarBinding

class DaftarFragment : Fragment() {
    private lateinit var communicator: Communicator

    private var _binding: FragmentDaftarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDaftarBinding.inflate(inflater, container, false)
        val view = binding.root

        communicator = activity as Communicator
        binding.btnDetail1.setOnClickListener {
            communicator.passData(binding.textFragement.text.toString())
        }
        binding.btnDetail2.setOnClickListener {
            communicator.passData1(binding.textFragement2.text.toString())
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}