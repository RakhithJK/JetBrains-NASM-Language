// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NASMInstruction extends PsiElement {

  @NotNull
  List<NASMAddress> getAddressList();

  @Nullable
  NASMDirective getDirective();

  @Nullable
  PsiElement getComment();

  @Nullable
  PsiElement getInsPrefix();

  @Nullable
  PsiElement getLabelDef();

  @Nullable
  PsiElement getMnemonicOp();

}