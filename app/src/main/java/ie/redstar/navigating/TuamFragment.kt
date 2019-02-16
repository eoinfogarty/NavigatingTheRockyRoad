package ie.redstar.navigating

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras

class TuamFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_tuam, container, false)

        val button = root.findViewById<Button>(R.id.mullingar_button)
        val image = root.findViewById<ImageView>(R.id.imageView)
        val extras = FragmentNavigatorExtras(
            image to "avatar"
        )

        button.setOnClickListener { view ->
            view.findNavController().navigate(
                R.id.action_tuamFragment_to_mullingarFragment1,
                null, // bundle of arguments
                null, // navigation option
                extras
            )
        }

        return root
    }
}
