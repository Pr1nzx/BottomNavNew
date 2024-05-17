package dapri.bottomnavnew.ui.favmusic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import dapri.bottomnavnew.R
import dapri.bottomnavnew.databinding.FragmentFavmusicBinding
import dapri.bottomnavnew.ui.dashboard.DashboardFragment

class FavmusicFragment : Fragment() {

    private var _binding: FragmentFavmusicBinding? = null
    private val binding get() = _binding!!

    companion object {
        val EXTRA_NAME_FAVMUSIC = "extra_name_favmusic"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavmusicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = arguments?.getString(DashboardFragment.EXTRA_NAME_FAVMUSIC)

        binding.textTitle.text = dataName

        binding.btnback.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_favmusic_to_navigation_dashboard)
        }

        binding.btnplaylist.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_favmusic_to_navigation_playlist)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}