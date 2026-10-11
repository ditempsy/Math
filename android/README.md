# Math Motion Android APK

This Android WebView wrapper packages the Math Motion page in app assets so the equation and drawing UI can run without a hosted website. Build with GitHub Actions from the **Actions → Build Math Motion Android APK → Run workflow** menu, or push changes under `android/`. Download the `math-motion-debug-apk` artifact from the completed workflow run.

Note: MP4 export depends on browser WebCodecs and the bundled mp4-muxer asset. Check export on the target Android device; some WebView versions do not expose the required H.264 encoder.
