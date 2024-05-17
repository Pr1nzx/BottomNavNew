package dapri.bottomnavnew.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dapri.bottomnavnew.R
import dapri.bottomnavnew.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    companion object {
        val EXTRA_NAME_FAVMUSIC = "extra_name_favmusic"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMusic.setOnClickListener { view ->
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME_FAVMUSIC, "Music Favorit di platform Spotify")
            view.findNavController().navigate(R.id.action_navigation_dashboard_to_navigation_favmusic, mBundle)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


