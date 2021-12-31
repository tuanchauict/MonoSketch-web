package io.monosketch.web

object GraphRes {
    private val graphs = mapOf(
        "client-server-db#1" to """
┌───────────────────────────────────────────────┐
│                                               │
│    Client           Server         Database   │
│                                     Server    │
│      █    message #1   █               █      │
│      █─ ─── ─── ─── ──▶█   update #1   █      │
│      █                 █─ ─── ─── ─── ▶█      │
│      █                 █               █      │
│      █                 █    OK #1      █      │
│      █      DONE #1    █◀── ─── ─── ───█      │
│      █◀── ─── ─── ─── ─█               █      │
│      █                 █               █      │
│                                               │
└───────────────────────────────────────────────┘
        """.trim(),
        "client-server-db#2" to """
┌───────────────────────────────────────────────┐
│                                               │
│    Client           Server         Database   │
│                                     Server    │
│      █    message #1   █               █      │
│      █── ─── ─── ─── ─▶█   update #1   █      │
│      █                 █── ─── ─── ───▶█      │
│      █                 █               █      │
│      █                 █    OK #1      █      │
│      █      DONE #1    █◀─ ─── ─── ─── █      │
│      █◀─ ─── ─── ─── ──█               █      │
│      █                 █               █      │
│                                               │
└───────────────────────────────────────────────┘
        """.trim(),
        "client-server-db#3" to """
┌───────────────────────────────────────────────┐
│                                               │
│    Client           Server         Database   │
│                                     Server    │
│      █    message #1   █               █      │
│      █─── ─── ─── ─── ▶█   update #1   █      │
│      █                 █─── ─── ─── ──▶█      │
│      █                 █               █      │
│      █                 █    OK #1      █      │
│      █      DONE #1    █◀ ─── ─── ─── ─█      │
│      █◀ ─── ─── ─── ───█               █      │
│      █                 █               █      │
│                                               │
└───────────────────────────────────────────────┘
        """.trim(),
        "client-server-db#4" to """
┌───────────────────────────────────────────────┐
│                                               │
│    Client           Server         Database   │
│                                     Server    │
│      █    message #1   █               █      │
│      █ ─── ─── ─── ───▶█   update #1   █      │
│      █                 █ ─── ─── ─── ─▶█      │
│      █                 █               █      │
│      █                 █    OK #1      █      │
│      █      DONE #1    █◀─── ─── ─── ──█      │
│      █◀─── ─── ─── ─── █               █      │
│      █                 █               █      │
│                                               │
└───────────────────────────────────────────────┘
        """.trim()
    )

    fun get(key: String): String? = graphs[key]
}