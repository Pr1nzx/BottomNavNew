package dapri.bottomnavnew.ui.playlist

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import dapri.bottomnavnew.R
import dapri.bottomnavnew.databinding.FragmentPlaylistBinding
import dapri.bottomnavnew.ui.dashboard.DashboardFragment

class PlaylistFragment : Fragment() {

    private var _binding: FragmentPlaylistBinding? = null
    private val binding get() = _binding!!

    private lateinit var spotify: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        spotify = view.findViewById(R.id.btnplaylist)
        spotify.setOnClickListener {
            val goToPlaylist =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/0zyQHttFmAgo31gH82NOzS?si=d3f67bc8394149ba"))
            startActivity(goToPlaylist)
        }

        val dataName = arguments?.getString(DashboardFragment.EXTRA_NAME_FAVMUSIC)



        binding.btnbackdashboard.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_playlist_to_navigation_dashboard)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}