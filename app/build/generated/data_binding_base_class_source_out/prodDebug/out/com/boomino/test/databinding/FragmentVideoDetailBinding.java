// Generated by data binding compiler. Do not edit!
package com.boomino.test.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.boomino.test.R;
import com.boomino.test.presentation.BaseImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentVideoDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgProfile;

  @NonNull
  public final BaseImageView imgVideo;

  @NonNull
  public final TextView txtCountOfView;

  @NonNull
  public final TextView txtTitle;

  @NonNull
  public final TextView txtUserName;

  protected FragmentVideoDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgProfile, BaseImageView imgVideo, TextView txtCountOfView,
      TextView txtTitle, TextView txtUserName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgProfile = imgProfile;
    this.imgVideo = imgVideo;
    this.txtCountOfView = txtCountOfView;
    this.txtTitle = txtTitle;
    this.txtUserName = txtUserName;
  }

  @NonNull
  public static FragmentVideoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoDetailBinding>inflateInternal(inflater, R.layout.fragment_video_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentVideoDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_video_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentVideoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentVideoDetailBinding>inflateInternal(inflater, R.layout.fragment_video_detail, null, false, component);
  }

  public static FragmentVideoDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentVideoDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentVideoDetailBinding)bind(component, view, R.layout.fragment_video_detail);
  }
}