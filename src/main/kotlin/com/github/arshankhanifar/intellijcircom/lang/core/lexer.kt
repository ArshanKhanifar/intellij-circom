package com.github.arshankhanifar.intellijcircom.lang.core

//import me.serce.solidity._SolidityLexer
import com.github.arshankhanifar.intellijcircom.lang.CircomLanguage
import com.intellij.lexer.FlexAdapter
import com.intellij.psi.tree.IElementType

class CircomTokenType(debugName: String) : IElementType(debugName, CircomLanguage)
//class CircomLexer : FlexAdapter(SimpleLex(null as Reader?))
