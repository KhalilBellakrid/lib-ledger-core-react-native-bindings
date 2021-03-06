// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

#import "RCTCoreLGAmount.h"


@implementation RCTCoreLGAmount
//Export module
RCT_EXPORT_MODULE(RCTCoreLGAmount)

@synthesize bridge = _bridge;


+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseRelease:currentInstance withResolver: resolve rejecter:reject];
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseLogWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseFlushWithResolver:resolve rejecter:reject];
}
RCT_REMAP_METHOD(isNull, isNull:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self baseIsNull:currentInstance withResolver:resolve rejecter:reject];
}

/**
 * Get amount as a BigInt.
 * @return BigInt
 */
RCT_REMAP_METHOD(toBigInt,toBigInt:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toBigInt, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toBigInt, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGBigInt * objcResult = [currentInstanceObj toBigInt];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGBigInt *rctImpl_objcResult = (RCTCoreLGBigInt *)[self.bridge moduleForName:@"CoreLGBigInt"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGBigInt", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toBigInt", nil);
        return;
    }

}

/**
 * Get currency in which amount was computed.
 * @return Currency object
 */
RCT_REMAP_METHOD(getCurrency,getCurrency:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::getCurrency, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::getCurrency, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGCurrency * objcResult = [currentInstanceObj getCurrency];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGCurrency *rctImpl_objcResult = (RCTCoreLGCurrency *)[self.bridge moduleForName:@"CoreLGCurrency"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGCurrency", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::getCurrency", nil);
        return;
    }

}

/**
 * Get currency unit in which amount was computed.
 * @return CurrencyUnit object
 */
RCT_REMAP_METHOD(getUnit,getUnit:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::getUnit, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::getUnit, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGCurrencyUnit * objcResult = [currentInstanceObj getUnit];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGCurrencyUnit *rctImpl_objcResult = (RCTCoreLGCurrencyUnit *)[self.bridge moduleForName:@"CoreLGCurrencyUnit"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGCurrencyUnit", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::getUnit", nil);
        return;
    }

}

/**
 * Convert amount in another currency unit.
 * @param CurrencyUnit object, target currency unit
 * @return Amount object, amount in target currency unit
 */
RCT_REMAP_METHOD(toUnit,toUnit:(NSDictionary *)currentInstance withParams:(NSDictionary *)unit withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toUnit, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toUnit, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGCurrencyUnit *rctParam_unit = (RCTCoreLGCurrencyUnit *)[self.bridge moduleForName:@"CoreLGCurrencyUnit"];
    LGCurrencyUnit *objcParam_0 = (LGCurrencyUnit *)[rctParam_unit.objcImplementations objectForKey:unit[@"uid"]];
    LGAmount * objcResult = [currentInstanceObj toUnit:objcParam_0];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAmount *rctImpl_objcResult = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGAmount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toUnit", nil);
        return;
    }

}

/** Get an amount that is equal to the given magnitude in the units system. */
RCT_REMAP_METHOD(toMagnitude,toMagnitude:(NSDictionary *)currentInstance withParams:(int)magnitude withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toMagnitude, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toMagnitude, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    LGAmount * objcResult = [currentInstanceObj toMagnitude:magnitude];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAmount *rctImpl_objcResult = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGAmount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toMagnitude", nil);
        return;
    }

}

/**
 * Get amount as string
 * @return string
 */
RCT_REMAP_METHOD(toString,toString:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toString, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toString, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSString * objcResult = [currentInstanceObj toString];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toString", nil);
        return;
    }

}

/**
 * Get amount as long
 * @return 64 bits integer
 */
RCT_REMAP_METHOD(toLong,toLong:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toLong, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toLong, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    NSInteger objcResult = [currentInstanceObj toLong];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toLong", nil);
        return;
    }

}

/**
 * Get amount as double
 * @return double
 */
RCT_REMAP_METHOD(toDouble,toDouble:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::toDouble, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::toDouble, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    double objcResult = [currentInstanceObj toDouble];
    NSDictionary *result = @{@"value" : @(objcResult)};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::toDouble", nil);
        return;
    }

}

/** Format an amount with a locale and some formatting rules. */
RCT_REMAP_METHOD(format,format:(NSDictionary *)currentInstance withParams:(NSDictionary *)locale
                                                                    rules:(nullable NSDictionary *)rules withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGAmount::format, first argument should be an instance of LGAmount", nil);
        return;
    }
    LGAmount *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGAmount::format, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
        return;
    }
    RCTCoreLGLocale *rctParam_locale = (RCTCoreLGLocale *)[self.bridge moduleForName:@"CoreLGLocale"];
    LGLocale *objcParam_0 = (LGLocale *)[rctParam_locale.objcImplementations objectForKey:locale[@"uid"]];
    RCTCoreLGFormatRules *rctParam_rules = (RCTCoreLGFormatRules *)[self.bridge moduleForName:@"CoreLGFormatRules"];
    LGFormatRules *objcParam_1 = (LGFormatRules *)[rctParam_rules.objcImplementations objectForKey:rules[@"uid"]];
    NSString * objcResult = [currentInstanceObj format:objcParam_0 rules:objcParam_1];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::format", nil);
        return;
    }

}

/** Transform an hexadecimal string into an amount (expressed in the given currency). */
RCT_REMAP_METHOD(fromHex,fromHexwithParams:(NSDictionary *)currency
                                       hex:(nonnull NSString *)hex withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreLGCurrency *rctParam_currency = (RCTCoreLGCurrency *)[self.bridge moduleForName:@"CoreLGCurrency"];
    LGCurrency *objcParam_0 = (LGCurrency *)[rctParam_currency.objcImplementations objectForKey:currency[@"uid"]];
    LGAmount * objcResult = [LGAmount fromHex:objcParam_0 hex:hex];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAmount *rctImpl_objcResult = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGAmount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::fromHex", nil);
        return;
    }

}

/** Transform a 64-bit number into an amount (expressed in the given currency). */
RCT_REMAP_METHOD(fromLong,fromLongwithParams:(NSDictionary *)currency
                                       value:(int)value withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreLGCurrency *rctParam_currency = (RCTCoreLGCurrency *)[self.bridge moduleForName:@"CoreLGCurrency"];
    LGCurrency *objcParam_0 = (LGCurrency *)[rctParam_currency.objcImplementations objectForKey:currency[@"uid"]];
    LGAmount * objcResult = [LGAmount fromLong:objcParam_0 value:value];

    NSString *objcResult_uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGAmount *rctImpl_objcResult = (RCTCoreLGAmount *)[self.bridge moduleForName:@"CoreLGAmount"];
    NSArray *objcResult_array = [[NSArray alloc] initWithObjects:objcResult, objcResult_uuid, nil];
    [rctImpl_objcResult baseSetObject:objcResult_array];
    NSDictionary *result = @{@"type" : @"CoreLGAmount", @"uid" : objcResult_uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGAmount::fromLong", nil);
        return;
    }

}
@end
