package com.github.arshankhanifar.intellijcircom.lang.core

import com.github.arshankhanifar.intellijcircom.lang.CircomFileType
import com.github.arshankhanifar.intellijcircom.lang.CircomLanguage
import com.github.arshankhanifar.intellijcircom.lang.psi.CircomElement
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.tree.IElementType

class CircomFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CircomLanguage), CircomElement {
  override fun getFileType(): FileType = CircomFileType
  override fun toString(): String = "Circom File"
}

class CircomElementType(val name: String) : IElementType(name, CircomLanguage)
