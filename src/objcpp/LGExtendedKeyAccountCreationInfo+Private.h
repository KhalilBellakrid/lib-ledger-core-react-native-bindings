// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#import "LGExtendedKeyAccountCreationInfo.h"
#include "ExtendedKeyAccountCreationInfo.hpp"

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGExtendedKeyAccountCreationInfo;

namespace djinni_generated {

struct ExtendedKeyAccountCreationInfo
{
    using CppType = ::ledger::core::api::ExtendedKeyAccountCreationInfo;
    using ObjcType = LGExtendedKeyAccountCreationInfo*;

    using Boxed = ExtendedKeyAccountCreationInfo;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCpp(const CppType& cpp);
};

}  // namespace djinni_generated
