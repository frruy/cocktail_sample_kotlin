// Generated by view binder compiler. Do not edit!
package com.well.designsystem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cn.carbswang.android.numberpickerview.library.NumberPickerView;
import com.well.designsystem.R;
import com.well.designsystem.view.CustomTextView;
import com.well.designsystem.view.bottomsheet.WellBottomSheetHeader;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogNumberPickerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView ivArrowDown;

  @NonNull
  public final ConstraintLayout layoutChooseNumber;

  @NonNull
  public final NumberPickerView npvNumber1;

  @NonNull
  public final NumberPickerView npvNumber2;

  @NonNull
  public final CustomTextView tvChangeUnit;

  @NonNull
  public final CustomTextView tvFoot;

  @NonNull
  public final CustomTextView tvUnit;

  @NonNull
  public final RelativeLayout viewChangeUnit;

  @NonNull
  public final WellBottomSheetHeader viewHeader;

  private DialogNumberPickerBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView ivArrowDown, @NonNull ConstraintLayout layoutChooseNumber,
      @NonNull NumberPickerView npvNumber1, @NonNull NumberPickerView npvNumber2,
      @NonNull CustomTextView tvChangeUnit, @NonNull CustomTextView tvFoot,
      @NonNull CustomTextView tvUnit, @NonNull RelativeLayout viewChangeUnit,
      @NonNull WellBottomSheetHeader viewHeader) {
    this.rootView = rootView;
    this.ivArrowDown = ivArrowDown;
    this.layoutChooseNumber = layoutChooseNumber;
    this.npvNumber1 = npvNumber1;
    this.npvNumber2 = npvNumber2;
    this.tvChangeUnit = tvChangeUnit;
    this.tvFoot = tvFoot;
    this.tvUnit = tvUnit;
    this.viewChangeUnit = viewChangeUnit;
    this.viewHeader = viewHeader;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogNumberPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogNumberPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_number_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogNumberPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_arrow_down;
      AppCompatImageView ivArrowDown = ViewBindings.findChildViewById(rootView, id);
      if (ivArrowDown == null) {
        break missingId;
      }

      id = R.id.layout_choose_number;
      ConstraintLayout layoutChooseNumber = ViewBindings.findChildViewById(rootView, id);
      if (layoutChooseNumber == null) {
        break missingId;
      }

      id = R.id.npv_number1;
      NumberPickerView npvNumber1 = ViewBindings.findChildViewById(rootView, id);
      if (npvNumber1 == null) {
        break missingId;
      }

      id = R.id.npv_number2;
      NumberPickerView npvNumber2 = ViewBindings.findChildViewById(rootView, id);
      if (npvNumber2 == null) {
        break missingId;
      }

      id = R.id.tv_change_unit;
      CustomTextView tvChangeUnit = ViewBindings.findChildViewById(rootView, id);
      if (tvChangeUnit == null) {
        break missingId;
      }

      id = R.id.tv_foot;
      CustomTextView tvFoot = ViewBindings.findChildViewById(rootView, id);
      if (tvFoot == null) {
        break missingId;
      }

      id = R.id.tv_unit;
      CustomTextView tvUnit = ViewBindings.findChildViewById(rootView, id);
      if (tvUnit == null) {
        break missingId;
      }

      id = R.id.view_change_unit;
      RelativeLayout viewChangeUnit = ViewBindings.findChildViewById(rootView, id);
      if (viewChangeUnit == null) {
        break missingId;
      }

      id = R.id.viewHeader;
      WellBottomSheetHeader viewHeader = ViewBindings.findChildViewById(rootView, id);
      if (viewHeader == null) {
        break missingId;
      }

      return new DialogNumberPickerBinding((ConstraintLayout) rootView, ivArrowDown,
          layoutChooseNumber, npvNumber1, npvNumber2, tvChangeUnit, tvFoot, tvUnit, viewChangeUnit,
          viewHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
