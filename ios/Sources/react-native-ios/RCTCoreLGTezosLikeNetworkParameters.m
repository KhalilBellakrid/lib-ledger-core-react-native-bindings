// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#import "RCTCoreLGTezosLikeNetworkParameters.h"
#import "LGTezosLikeNetworkParameters.h"

@implementation RCTCoreLGTezosLikeNetworkParameters

//Export module
RCT_EXPORT_MODULE(RCTCoreLGTezosLikeNetworkParameters)

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
-(NSData *) hexStringToData: (NSString *)hexString 
{
    NSMutableData *data= [[NSMutableData alloc] init];
    unsigned char byte;
    char byteChars[3] = {'\0','\0','\0'};
    for (int i = 0; i < ([hexString length] / 2); i++)
    {
        byteChars[0] = [hexString characterAtIndex: i*2];
        byteChars[1] = [hexString characterAtIndex: i*2 + 1];
        byte = strtol(byteChars, NULL, 16);
        [data appendBytes:&byte length:1];
    }
    return data;
}
-(NSString *) dataToHexString: (NSData *)data 
{
    const unsigned char *bytes = (const unsigned char *)data.bytes;
    NSMutableString *hex = [NSMutableString new];
    for (NSInteger i = 0; i < data.length; i++)
    {
        [hex appendFormat:@"%02x", bytes[i]];
    }
    return [hex copy];
}
RCT_REMAP_METHOD(init, initWithIdentifier:(nonnull NSString *)Identifier
                            MessagePrefix:(nonnull NSString *)MessagePrefix
                              XPUBVersion:(NSString *)XPUBVersion
                           ImplicitPrefix:(NSString *)ImplicitPrefix
                         OriginatedPrefix:(NSString *)OriginatedPrefix
                           AdditionalTIPs:(nonnull NSArray<NSString *> *)AdditionalTIPs
                           TimestampDelay:(int)TimestampDelay withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    NSData *field_2 = [self hexStringToData:XPUBVersion];

    NSData *field_3 = [self hexStringToData:ImplicitPrefix];

    NSData *field_4 = [self hexStringToData:OriginatedPrefix];



    LGTezosLikeNetworkParameters * finalResult = [[LGTezosLikeNetworkParameters alloc] initWithIdentifier:Identifier MessagePrefix:MessagePrefix XPUBVersion:field_2 ImplicitPrefix:field_3 OriginatedPrefix:field_4 AdditionalTIPs:AdditionalTIPs TimestampDelay:TimestampDelay];
    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGTezosLikeNetworkParameters *rctImpl = (RCTCoreLGTezosLikeNetworkParameters *)[self.bridge moduleForName:@"CoreLGTezosLikeNetworkParameters"];
    NSArray *finalResultArray = [[NSArray alloc] initWithObjects:finalResult, uuid, nil];
    [rctImpl baseSetObject:finalResultArray];
    NSDictionary *result = @{@"type" : @"CoreLGTezosLikeNetworkParameters", @"uid" : uuid };
    if (result)
    {
        resolve(result);
    }
}

RCT_REMAP_METHOD(getIdentifier, getIdentifier:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.Identifier};
    resolve(result);
}

RCT_REMAP_METHOD(getMessagePrefix, getMessagePrefix:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.MessagePrefix};
    resolve(result);
}

RCT_REMAP_METHOD(getXPUBVersion, getXPUBVersion:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSString *objcImplXPUBVersionHexString = [self dataToHexString:objcImpl.XPUBVersion];
    NSDictionary *result = @{@"value" : objcImplXPUBVersionHexString};
    resolve(result);
}

RCT_REMAP_METHOD(getImplicitPrefix, getImplicitPrefix:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSString *objcImplImplicitPrefixHexString = [self dataToHexString:objcImpl.ImplicitPrefix];
    NSDictionary *result = @{@"value" : objcImplImplicitPrefixHexString};
    resolve(result);
}

RCT_REMAP_METHOD(getOriginatedPrefix, getOriginatedPrefix:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSString *objcImplOriginatedPrefixHexString = [self dataToHexString:objcImpl.OriginatedPrefix];
    NSDictionary *result = @{@"value" : objcImplOriginatedPrefixHexString};
    resolve(result);
}

RCT_REMAP_METHOD(getAdditionalTIPs, getAdditionalTIPs:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : objcImpl.AdditionalTIPs};
    resolve(result);
}

RCT_REMAP_METHOD(getTimestampDelay, getTimestampDelay:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)rejecter)
{
    LGTezosLikeNetworkParameters *objcImpl = (LGTezosLikeNetworkParameters *)[self.objcImplementations objectForKey:currentInstance[@"uid"]];
    NSDictionary *result = @{@"value" : @((int)objcImpl.TimestampDelay)};
    resolve(result);
}

@end
