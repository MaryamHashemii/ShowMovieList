package com.boomino.test.presentation.video_detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.boomino.test.domain.model.ItemVideo
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FragmentVideoDetailArgs(
  public val videoInfo: ItemVideo
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentVideoDetailArgs {
      bundle.setClassLoader(FragmentVideoDetailArgs::class.java.classLoader)
      val __videoInfo : ItemVideo?
      if (bundle.containsKey("videoInfo")) {
        if (Parcelable::class.java.isAssignableFrom(ItemVideo::class.java) ||
            Serializable::class.java.isAssignableFrom(ItemVideo::class.java)) {
          __videoInfo = bundle.get("videoInfo") as ItemVideo?
        } else {
          throw UnsupportedOperationException(ItemVideo::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__videoInfo == null) {
          throw IllegalArgumentException("Argument \"videoInfo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"videoInfo\" is missing and does not have an android:defaultValue")
      }
      return FragmentVideoDetailArgs(__videoInfo)
    }
  }
}
