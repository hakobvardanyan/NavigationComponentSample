package com.hakvardanyan.navigationsample.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewbinding.ViewBinding
import com.hakvardanyan.navigationsample.BaseFragment
import com.hakvardanyan.navigationsample.databinding.FragmentNotificationDetailsBinding

class NotificationDetailsFragment : BaseFragment<FragmentNotificationDetailsBinding>() {

    override val bindingInitializer: (LayoutInflater) -> ViewBinding = FragmentNotificationDetailsBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.apply {
            val notification = arguments?.getSerializable(KEY_NOTIFICATION) as? Notification ?: Notification.INCOME
            title.text = notification.title
            icon.setImageResource(notification.drawable)
            description.text = DESCRIPTION
        }
    }

    private companion object {
        const val DESCRIPTION =
            "Contrary to popular belief, Lorem Ipsum is not simply random text. " +
                    "It has roots in a piece of classical Latin literature from 45 BC, making it over " +
                    "It has roots in a piece of classical Latin literature from 45 BC, making it over " +
                    "2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in" +
                    " Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, " +
                    " Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, " +
                    "and going through the cites of the word in classical literature, discovered the undoubtable source. " +
                    "and going through the cites of the word in classical literature, discovered the undoubtable source. " +
                    "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" " +
                    "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" " +
                    "(The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, " +
                    "(The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, " +
                    "very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                    "very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                    "\n" + "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested." +
                    "\n" + "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested." +
                    "\n" + "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested." +
                    "\n" + "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested." +
                    " Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form," +
                    " Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form," +
                    " accompanied by English versions from the 1914 translation by H. Rackham. "
    }
}
