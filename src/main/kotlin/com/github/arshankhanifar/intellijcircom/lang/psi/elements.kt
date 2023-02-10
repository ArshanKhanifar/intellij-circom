package com.github.arshankhanifar.intellijcircom.lang.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference

interface CircomElement : PsiElement {
  override fun getReference(): PsiReference?
}
