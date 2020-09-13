/*
 * Copyright 2019-2020 Louis Cognault Ayeva Derman. Use of this source code is governed by the Apache 2.0 license.
 */

package splitties.views.dsl.material.experimental

import splitties.initprovider.InitProvider
import splitties.initprovider.ObsoleteContentProviderHack
import splitties.views.dsl.core.experimental.ViewFactoryImpl

@OptIn(ObsoleteContentProviderHack::class)
internal class MaterialViewInstantiatorInjectProvider : InitProvider() {

    //TODO: Replace this InitProvider with AndroidX Startup once its API is stable.

    override fun onCreate(): Boolean {
        ViewFactoryImpl.appInstance.apply {
            add(::instantiateMaterialView)
            addForThemeAttrStyled(::instantiateThemeAttrStyledMaterialView)
        }
        return true
    }
}
