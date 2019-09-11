// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from tezos_like_wallet.djinni

#include "TezosLikeTransactionBuilder.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGTezosLikeTransactionBuilder;

namespace djinni_generated {

class TezosLikeTransactionBuilder
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::TezosLikeTransactionBuilder>;
    using CppOptType = std::shared_ptr<::ledger::core::api::TezosLikeTransactionBuilder>;
    using ObjcType = LGTezosLikeTransactionBuilder*;

    using Boxed = TezosLikeTransactionBuilder;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated
