// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#include "BitcoinLikeTransaction.hpp"
#include <memory>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@class LGBitcoinLikeTransaction;

namespace djinni_generated {

class BitcoinLikeTransaction
{
public:
    using CppType = std::shared_ptr<::ledger::core::api::BitcoinLikeTransaction>;
    using CppOptType = std::shared_ptr<::ledger::core::api::BitcoinLikeTransaction>;
    using ObjcType = LGBitcoinLikeTransaction*;

    using Boxed = BitcoinLikeTransaction;

    static CppType toCpp(ObjcType objc);
    static ObjcType fromCppOpt(const CppOptType& cpp);
    static ObjcType fromCpp(const CppType& cpp) { return fromCppOpt(cpp); }

private:
    class ObjcProxy;
};

}  // namespace djinni_generated

