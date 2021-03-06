// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from tezos_like_wallet.djinni

#ifndef DJINNI_GENERATED_TEZOSLIKEOPERATION_HPP
#define DJINNI_GENERATED_TEZOSLIKEOPERATION_HPP

#include <memory>

namespace ledger { namespace core { namespace api {

class TezosLikeTransaction;

/**Class representing a Tezos Operation */
class TezosLikeOperation {
public:
    virtual ~TezosLikeOperation() {}

    /**
     *Get operation's transaction
     *@return TezosLikeTransaction object
     */
    virtual std::shared_ptr<TezosLikeTransaction> getTransaction() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_TEZOSLIKEOPERATION_HPP
