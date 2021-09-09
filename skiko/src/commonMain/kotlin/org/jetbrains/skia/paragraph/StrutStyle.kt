@file:Suppress("NESTED_EXTERNAL_DECLARATION")
package org.jetbrains.skia.paragraph

import org.jetbrains.skia.impl.Library.Companion.staticLoad
import org.jetbrains.skia.*
import org.jetbrains.skia.impl.Managed
import org.jetbrains.skia.impl.Native
import org.jetbrains.skia.impl.Stats
import org.jetbrains.skia.impl.reachabilityBarrier
import org.jetbrains.skia.ExternalSymbolName
import org.jetbrains.skia.impl.NativePointer
import org.jetbrains.skia.impl.getPtr
import kotlin.jvm.JvmStatic

class StrutStyle internal constructor(ptr: NativePointer) : Managed(ptr, _FinalizerHolder.PTR) {
    companion object {
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetFinalizer")
        external fun _nGetFinalizer(): NativePointer
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nMake")
        external fun _nMake(): NativePointer
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nEquals")
        external fun _nEquals(ptr: NativePointer, otherPtr: NativePointer): Boolean
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetFontFamilies")
        external fun _nGetFontFamilies(ptr: NativePointer): Array<String>
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetFontFamilies")
        external fun _nSetFontFamilies(ptr: NativePointer, families: Array<String?>?)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetFontStyle")
        external fun _nGetFontStyle(ptr: NativePointer): Int
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetFontStyle")
        external fun _nSetFontStyle(ptr: NativePointer, value: Int)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetFontSize")
        external fun _nGetFontSize(ptr: NativePointer): Float
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetFontSize")
        external fun _nSetFontSize(ptr: NativePointer, value: Float)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetHeight")
        external fun _nGetHeight(ptr: NativePointer): Float
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetHeight")
        external fun _nSetHeight(ptr: NativePointer, value: Float)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nGetLeading")
        external fun _nGetLeading(ptr: NativePointer): Float
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetLeading")
        external fun _nSetLeading(ptr: NativePointer, value: Float)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nIsEnabled")
        external fun _nIsEnabled(ptr: NativePointer): Boolean
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetEnabled")
        external fun _nSetEnabled(ptr: NativePointer, value: Boolean)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nIsHeightForced")
        external fun _nIsHeightForced(ptr: NativePointer): Boolean
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetHeightForced")
        external fun _nSetHeightForced(ptr: NativePointer, value: Boolean)
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nIsHeightOverridden")
        external fun _nIsHeightOverridden(ptr: NativePointer): Boolean
        @JvmStatic
        @ExternalSymbolName("org_jetbrains_skia_StrutStyle__1nSetHeightOverridden")
        external fun _nSetHeightOverridden(ptr: NativePointer, value: Boolean)

        init {
            staticLoad()
        }
    }

    constructor() : this(_nMake()) {
        Stats.onNativeCall()
    }

    override fun _nativeEquals(other: Native?): Boolean {
        return try {
            Stats.onNativeCall()
            _nEquals(_ptr, getPtr(other))
        } finally {
            reachabilityBarrier(this)
            reachabilityBarrier(other)
        }
    }

    val fontFamilies: Array<String>
        get() = try {
            Stats.onNativeCall()
            _nGetFontFamilies(_ptr)
        } finally {
            reachabilityBarrier(this)
        }

    fun setFontFamilies(families: Array<String?>?): StrutStyle {
        Stats.onNativeCall()
        _nSetFontFamilies(_ptr, families)
        return this
    }

    var fontStyle: FontStyle
        get() = try {
            Stats.onNativeCall()
            FontStyle(_nGetFontStyle(_ptr))
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setFontStyle(value)
        }
    
    fun setFontStyle(style: FontStyle): StrutStyle {
        Stats.onNativeCall()
        _nSetFontStyle(_ptr, style._value)
        return this
    }

    var fontSize: Float
        get() = try {
            Stats.onNativeCall()
            _nGetFontSize(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setFontSize(value)
        }

    fun setFontSize(value: Float): StrutStyle {
        Stats.onNativeCall()
        _nSetFontSize(_ptr, value)
        return this
    }

    var height: Float
        get() = try {
            Stats.onNativeCall()
            _nGetHeight(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setHeight(value)
        }
    
    fun setHeight(value: Float): StrutStyle {
        Stats.onNativeCall()
        _nSetHeight(_ptr, value)
        return this
    }

    var leading: Float
        get() = try {
            Stats.onNativeCall()
            _nGetLeading(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setLeading(value)
        }
    
    fun setLeading(value: Float): StrutStyle {
        Stats.onNativeCall()
        _nSetLeading(_ptr, value)
        return this
    }

    var isEnabled: Boolean
        get() = try {
            Stats.onNativeCall()
            _nIsEnabled(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setEnabled(value)
        }
    
    fun setEnabled(value: Boolean): StrutStyle {
        Stats.onNativeCall()
        _nSetEnabled(_ptr, value)
        return this
    }

    var isHeightForced: Boolean
        get() = try {
            Stats.onNativeCall()
            _nIsHeightForced(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setHeightForced(value)
        }
    
    fun setHeightForced(value: Boolean): StrutStyle {
        Stats.onNativeCall()
        _nSetHeightForced(_ptr, value)
        return this
    }

    var isHeightOverridden: Boolean
        get() = try {
            Stats.onNativeCall()
            _nIsHeightOverridden(_ptr)
        } finally {
            reachabilityBarrier(this)
        }
        set(value) {
            setHeightOverridden(value)
        }
    
    fun setHeightOverridden(value: Boolean): StrutStyle {
        Stats.onNativeCall()
        _nSetHeightOverridden(_ptr, value)
        return this
    }

    private object _FinalizerHolder {
        val PTR = _nGetFinalizer()
    }
}