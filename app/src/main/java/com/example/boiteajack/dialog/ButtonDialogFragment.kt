package com.example.boiteajack.dialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.boiteajack.R

class ButtonDialogFragment (private val context: Context) : DialogFragment(){

    @SuppressLint("MissingInflatedId")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = requireActivity().layoutInflater.inflate(R.layout.dailog_layout,null)
        val editText : EditText = view.findViewById(R.id.name_button)


        return AlertDialog.Builder(requireContext())
            .setTitle("titre")
            .setView(view)
            .setPositiveButton("button"){_, _ ->
                val text = editText.text.toString()
                if (text.isNotEmpty()){
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
                }
            }.setNegativeButton("annuler",null)
            .create()
    }
}