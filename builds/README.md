# Builds

- **Primary Release Artifact:** `Aelokia-universal-v5.2.1.apk`
  - Variant: `release` (`:app:assembleRelease`, minSdk 29)
  - Optimizations: R8 code shrinking, dead-code elimination, resource shrinking (`isMinifyEnabled = true`, `isShrinkResources = true`)
  - Listed first in release assets — the recommended download for Android 10+
- **Debug Artifact:** `Aelokia-v5.2.1-debug.apk`
  - Variant: `debug` (`:app:assembleDebug`)
  - Uncompressed full DEX with all debug symbols, no R8 shrinking
- **Version:** `5.2.1` (versionCode `33`)
- **Toolchain:** Gradle 9.3.1, OpenJDK 17, Android compileSdk 37, targetSdk 35, minSdk 29
