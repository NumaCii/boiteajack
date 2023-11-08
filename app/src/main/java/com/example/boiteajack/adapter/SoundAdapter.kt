package com.example.boiteajack.adapter

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.boiteajack.R


class SoundAdapter( val context : Context): RecyclerView.Adapter<SoundAdapter.SoundHolder>()
{
    private lateinit var mediaPlayer : MediaPlayer
    private lateinit var listeSon : MutableList<R.raw>
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): SoundHolder {
        val view = LayoutInflater.from(parent.context) .inflate(R.layout.sound_layout, parent, false)

        return SoundHolder(view)
    }

    override fun onBindViewHolder(holder: SoundHolder, position: Int) {
        holder.button.setOnClickListener {



            mediaPlayer = MediaPlayer.create(context, R.raw.fart)
            mediaPlayer.apply { setAudioAttributes(AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
            )}
            if (mediaPlayer.isPlaying()){
                mediaPlayer.release()
            }
            mediaPlayer.start()
        }
        holder.button2.setOnClickListener {


            mediaPlayer = MediaPlayer.create(context, R.raw.arabe)
            mediaPlayer.apply { setAudioAttributes(AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
            )}
            if (mediaPlayer.isPlaying()){
                mediaPlayer.release()
            }
            mediaPlayer.start()
        }
        holder.button3.setOnClickListener {


            mediaPlayer = MediaPlayer.create(context, R.raw.mastu)
            mediaPlayer.apply { setAudioAttributes(AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
            )}
            if (mediaPlayer.isPlaying()){
                mediaPlayer.release()
            }
            mediaPlayer.start()
        }
        holder.button4.setOnClickListener {


            mediaPlayer = MediaPlayer.create(context, R.raw.agh)
            mediaPlayer.apply { setAudioAttributes(AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()
            )}
            if (mediaPlayer.isPlaying()){
                mediaPlayer.release()
            }
            mediaPlayer.start()
        }
    }
    override fun getItemCount(): Int {
        return 10
    }


    class SoundHolder(val elements : View) : RecyclerView.ViewHolder(elements)
    {
        val button = elements.findViewById<Button>(R.id.play_sound)
        val button2 = elements.findViewById<Button>(R.id.play_sound2)
        val button3 = elements.findViewById<Button>(R.id.play_sound3)
        val button4 = elements.findViewById<Button>(R.id.play_sound4)
    }
}

