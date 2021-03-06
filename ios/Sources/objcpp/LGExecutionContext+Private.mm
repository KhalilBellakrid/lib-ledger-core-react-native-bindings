// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

#import "LGExecutionContext+Private.h"
#import "LGExecutionContext.h"
#import "DJIMarshal+Private.h"
#import "DJIObjcWrapperCache+Private.h"
#import "LGRunnable+Private.h"
#include <stdexcept>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

namespace djinni_generated {

class ExecutionContext::ObjcProxy final
: public ::ledger::core::api::ExecutionContext
, private ::djinni::ObjcProxyBase<ObjcType>
{
    friend class ::djinni_generated::ExecutionContext;
public:
    using ObjcProxyBase::ObjcProxyBase;
    void execute(const std::shared_ptr<::ledger::core::api::Runnable> & c_runnable) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() execute:(::djinni_generated::Runnable::fromCpp(c_runnable))];
        }
    }
    void delay(const std::shared_ptr<::ledger::core::api::Runnable> & c_runnable, int64_t c_millis) override
    {
        @autoreleasepool {
            [djinni_private_get_proxied_objc_object() delay:(::djinni_generated::Runnable::fromCpp(c_runnable))
                                                     millis:(::djinni::I64::fromCpp(c_millis))];
        }
    }
};

}  // namespace djinni_generated

namespace djinni_generated {

auto ExecutionContext::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return ::djinni::get_objc_proxy<ObjcProxy>(objc);
}

auto ExecutionContext::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return dynamic_cast<ObjcProxy&>(*cpp).djinni_private_get_proxied_objc_object();
}

}  // namespace djinni_generated
