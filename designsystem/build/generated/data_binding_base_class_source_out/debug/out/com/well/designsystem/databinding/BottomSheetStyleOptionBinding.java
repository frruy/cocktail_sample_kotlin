// Generated by data binding compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import com.well.designsystem.view.bottomsheet.WellBottomSheetHeader;
import com.well.designsystem.view.button.WellButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BottomSheetStyleOptionBinding extends ViewDataBinding {
  @NonNull
  public final WellButton btnNegative;

  @NonNull
  public final WellButton btnPositive;

  @NonNull
  public final RecyclerView rvListItem;

  @NonNull
  public final CustomTextView tvContent;

  @NonNull
  public final WellBottomSheetHeader viewHeader;

  protected BottomSheetStyleOptionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, WellButton btnNegative, WellButton btnPositive, RecyclerView rvListItem,
      CustomTextView tvContent, WellBottomSheetHeader viewHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNegative = btnNegative;
    this.btnPositive = btnPositive;
    this.rvListItem = rvListItem;
    this.tvContent = tvContent;
    this.viewHeader = viewHeader;
  }

  @NonNull
  public static BottomSheetStyleOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottom_sheet_style_option, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BottomSheetStyleOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BottomSheetStyleOptionBinding>inflateInternal(inflater, R.layout.bottom_sheet_style_option, root, attachToRoot, component);
  }

  @NonNull
  public static BottomSheetStyleOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.bottom_sheet_style_option, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BottomSheetStyleOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BottomSheetStyleOptionBinding>inflateInternal(inflater, R.layout.bottom_sheet_style_option, null, false, component);
  }

  public static BottomSheetStyleOptionBinding bind(@NonNull View view) {
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
  public static BottomSheetStyleOptionBinding bind(@NonNull View view, @Nullable Object component) {
    return (BottomSheetStyleOptionBinding)bind(component, view, R.layout.bottom_sheet_style_option);
  }
}
