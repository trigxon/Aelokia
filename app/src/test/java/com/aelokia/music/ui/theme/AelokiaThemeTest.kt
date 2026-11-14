package com.aelokia.music.ui.theme

import androidx.compose.ui.graphics.Color
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class AelokiaThemeTest {

    @Test
    fun aelokiaDarkScheme_usesBrandColors() {
        val scheme = Md3SchemeBuilder.buildAelokiaDarkScheme(amoled = false)

        assertThat(scheme.primary).isEqualTo(Color(0xFFC9FB00))
        assertThat(scheme.onPrimary).isEqualTo(Color(0xFF012226))
        assertThat(scheme.surface).isEqualTo(Color(0xFF012226))
        assertThat(scheme.background).isEqualTo(Color(0xFF01181B))
    }

    @Test
    fun aelokiaDarkScheme_amoled_pureBlackSurfaces() {
        val scheme = Md3SchemeBuilder.buildAelokiaDarkScheme(amoled = true)

        assertThat(scheme.primary).isEqualTo(Color(0xFFC9FB00))
        assertThat(scheme.onPrimary).isEqualTo(Color(0xFF012226))
        assertThat(scheme.background).isEqualTo(Color.Black)
        assertThat(scheme.surface).isEqualTo(Color.Black)
        assertThat(scheme.surfaceContainerLowest).isEqualTo(Color.Black)
        assertThat(scheme.surfaceContainerLow).isEqualTo(Color.Black)
    }

    @Test
    fun aelokiaLightScheme_usesBrandHighlights() {
        val scheme = Md3SchemeBuilder.buildAelokiaLightScheme()

        assertThat(scheme.onPrimaryContainer).isEqualTo(Color(0xFF012226))
        assertThat(scheme.inversePrimary).isEqualTo(Color(0xFFC9FB00))
        assertThat(scheme.inverseSurface).isEqualTo(Color(0xFF012226))
    }
}
