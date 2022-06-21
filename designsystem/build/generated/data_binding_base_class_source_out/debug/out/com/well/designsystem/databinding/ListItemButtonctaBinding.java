// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import com.well.designsystem.view.button.WellButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemButtonctaBinding extends ViewDataBinding {
  @NonNull
  public final WellButton btnPlain;

  @NonNull
  public final WellButton btnPrimary;

  @NonNull
  public final WellButton btnSecondary;

  @NonNull
  public final AppCompatImageView ivEndIcon;

  @NonNull
  public final AppCompatImageView ivStartIcon;

  @NonNull
  public final CustomTextView tvTitle;

  @NonNull
  public final FrameLayout viewButton;

  protected ListItemButtonctaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      WellButton btnPlain, WellButton btnPrimary, WellButton btnSecondary,
      AppCompatImageView ivEndIcon, AppCompatImageView ivStartIcon, CustomTextView tvTitle,
      FrameLayout viewButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnPlain = btnPlain;
    this.btnPrimary = btnPrimary;
    this.btnSecondary = btnSecondary;
    this.ivEndIcon = ivEndIcon;
    this.ivStartIcon = ivStartIcon;
    this.tvTitle = tvTitle;
    this.viewButton = viewButton;
  }

  @NonNull
  public static ListItemButtonctaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_buttoncta, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemButtonctaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemButtonctaBinding>inflateInternal(inflater, R.layout.list_item_buttoncta, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemButtonctaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_buttoncta, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemButtonctaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemButtonctaBinding>inflateInternal(inflater, R.layout.list_item_buttoncta, null, false, component);
  }

  public static ListItemButtonctaBinding bind(@NonNull View view) {
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
  public static ListItemButtonctaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemButtonctaBinding)bind(component, view, R.layout.list_item_buttoncta);
  }
}