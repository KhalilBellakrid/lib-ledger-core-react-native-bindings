{
  "targets": [
    {
      "target_name": "djinni_objc",
      "type": "static_library",
      "xcode_settings": {
        "CLANG_ENABLE_OBJC_ARC": "YES",
      },
      "sources": [
        "objc/DJICppWrapperCache+Private.h",
        "objc/DJIError.h",
        "objc/DJIError.mm",
        "objc/DJIMarshal+Private.h",
        "objc/DJIObjcWrapperCache+Private.h",
        "objc/DJIProxyCaches.mm",
        "proxy_cache_impl.hpp",
        "proxy_cache_interface.hpp",
      ],
      "include_dirs": [
        "objc",
      ],
      "direct_dependent_settings": {
        "include_dirs": [
          "objc",
        ],
      },
    },
  ],
}
