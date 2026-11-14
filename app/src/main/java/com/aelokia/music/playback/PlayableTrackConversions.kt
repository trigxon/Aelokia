package com.aelokia.music.playback

import com.aelokia.music.data.generate.GeneratedTrack
import com.aelokia.music.data.generate.LocalAudioFormats

internal fun PlayableTrack.toGeneratedTrack() = GeneratedTrack(
    name = title,
    artist = artist,
    artworkUrl = artworkUrl,
    album = album,
    trackNumber = trackNumber,
    durationMs = durationMs,
    // Pure device-local files (no videoId) keep their storage path/URI so offline likes
    // and offline playlists operate on the file directly.
    url = if (videoId.isNullOrBlank()) {
        LocalAudioFormats.importedPathOrNull(playbackUrl).orEmpty()
    } else {
        LocalAudioFormats.importedPathOrNull(playbackUrl)
            ?: "https://music.youtube.com/watch?v=$videoId"
    },
)
