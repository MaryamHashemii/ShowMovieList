package com.boomino.test.presentation.video

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.boomino.test.R
import com.boomino.test.domain.model.ItemVideo
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class VideoFragmentDirections private constructor() {
  private data class ActionVideoFragmentToVideoDetailFragment(
    public val videoInfo: ItemVideo
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_videoFragment_to_videoDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ItemVideo::class.java)) {
        result.putParcelable("videoInfo", this.videoInfo as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ItemVideo::class.java)) {
        result.putSerializable("videoInfo", this.videoInfo as Serializable)
      } else {
        throw UnsupportedOperationException(ItemVideo::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionVideoFragmentToVideoDetailFragment(videoInfo: ItemVideo): NavDirections =
        ActionVideoFragmentToVideoDetailFragment(videoInfo)
  }
}
