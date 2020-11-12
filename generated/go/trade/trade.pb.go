// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.13.0
// source: trade.proto

package trade

import (
	proto "github.com/golang/protobuf/proto"
	swap "github.com/tdex-network/tdex-protobuf/generated/go/swap"
	types "github.com/tdex-network/tdex-protobuf/generated/go/types"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type TradeType int32

const (
	TradeType_BUY  TradeType = 0
	TradeType_SELL TradeType = 1
)

// Enum value maps for TradeType.
var (
	TradeType_name = map[int32]string{
		0: "BUY",
		1: "SELL",
	}
	TradeType_value = map[string]int32{
		"BUY":  0,
		"SELL": 1,
	}
)

func (x TradeType) Enum() *TradeType {
	p := new(TradeType)
	*p = x
	return p
}

func (x TradeType) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (TradeType) Descriptor() protoreflect.EnumDescriptor {
	return file_trade_proto_enumTypes[0].Descriptor()
}

func (TradeType) Type() protoreflect.EnumType {
	return &file_trade_proto_enumTypes[0]
}

func (x TradeType) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use TradeType.Descriptor instead.
func (TradeType) EnumDescriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{0}
}

// BOTD#4 Service's messages
type MarketsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *MarketsRequest) Reset() {
	*x = MarketsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MarketsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MarketsRequest) ProtoMessage() {}

func (x *MarketsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MarketsRequest.ProtoReflect.Descriptor instead.
func (*MarketsRequest) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{0}
}

type MarketsReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Markets []*types.MarketWithFee `protobuf:"bytes,1,rep,name=markets,proto3" json:"markets,omitempty"`
}

func (x *MarketsReply) Reset() {
	*x = MarketsReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MarketsReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MarketsReply) ProtoMessage() {}

func (x *MarketsReply) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MarketsReply.ProtoReflect.Descriptor instead.
func (*MarketsReply) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{1}
}

func (x *MarketsReply) GetMarkets() []*types.MarketWithFee {
	if x != nil {
		return x.Markets
	}
	return nil
}

type BalancesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Market *types.Market `protobuf:"bytes,1,opt,name=market,proto3" json:"market,omitempty"`
}

func (x *BalancesRequest) Reset() {
	*x = BalancesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BalancesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BalancesRequest) ProtoMessage() {}

func (x *BalancesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BalancesRequest.ProtoReflect.Descriptor instead.
func (*BalancesRequest) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{2}
}

func (x *BalancesRequest) GetMarket() *types.Market {
	if x != nil {
		return x.Market
	}
	return nil
}

type BalancesReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Balances []*types.BalanceWithFee `protobuf:"bytes,1,rep,name=balances,proto3" json:"balances,omitempty"`
}

func (x *BalancesReply) Reset() {
	*x = BalancesReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BalancesReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BalancesReply) ProtoMessage() {}

func (x *BalancesReply) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BalancesReply.ProtoReflect.Descriptor instead.
func (*BalancesReply) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{3}
}

func (x *BalancesReply) GetBalances() []*types.BalanceWithFee {
	if x != nil {
		return x.Balances
	}
	return nil
}

type MarketPriceRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Market *types.Market `protobuf:"bytes,1,opt,name=market,proto3" json:"market,omitempty"`
	Type   TradeType     `protobuf:"varint,2,opt,name=type,proto3,enum=TradeType" json:"type,omitempty"`
	Amount uint64        `protobuf:"varint,3,opt,name=amount,proto3" json:"amount,omitempty"`
}

func (x *MarketPriceRequest) Reset() {
	*x = MarketPriceRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MarketPriceRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MarketPriceRequest) ProtoMessage() {}

func (x *MarketPriceRequest) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MarketPriceRequest.ProtoReflect.Descriptor instead.
func (*MarketPriceRequest) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{4}
}

func (x *MarketPriceRequest) GetMarket() *types.Market {
	if x != nil {
		return x.Market
	}
	return nil
}

func (x *MarketPriceRequest) GetType() TradeType {
	if x != nil {
		return x.Type
	}
	return TradeType_BUY
}

func (x *MarketPriceRequest) GetAmount() uint64 {
	if x != nil {
		return x.Amount
	}
	return 0
}

type MarketPriceReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Prices []*types.PriceWithFee `protobuf:"bytes,1,rep,name=prices,proto3" json:"prices,omitempty"`
}

func (x *MarketPriceReply) Reset() {
	*x = MarketPriceReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MarketPriceReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MarketPriceReply) ProtoMessage() {}

func (x *MarketPriceReply) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MarketPriceReply.ProtoReflect.Descriptor instead.
func (*MarketPriceReply) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{5}
}

func (x *MarketPriceReply) GetPrices() []*types.PriceWithFee {
	if x != nil {
		return x.Prices
	}
	return nil
}

type TradeProposeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Market      *types.Market     `protobuf:"bytes,1,opt,name=market,proto3" json:"market,omitempty"`
	Type        TradeType         `protobuf:"varint,2,opt,name=type,proto3,enum=TradeType" json:"type,omitempty"`
	SwapRequest *swap.SwapRequest `protobuf:"bytes,3,opt,name=swap_request,json=swapRequest,proto3" json:"swap_request,omitempty"`
}

func (x *TradeProposeRequest) Reset() {
	*x = TradeProposeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TradeProposeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TradeProposeRequest) ProtoMessage() {}

func (x *TradeProposeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TradeProposeRequest.ProtoReflect.Descriptor instead.
func (*TradeProposeRequest) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{6}
}

func (x *TradeProposeRequest) GetMarket() *types.Market {
	if x != nil {
		return x.Market
	}
	return nil
}

func (x *TradeProposeRequest) GetType() TradeType {
	if x != nil {
		return x.Type
	}
	return TradeType_BUY
}

func (x *TradeProposeRequest) GetSwapRequest() *swap.SwapRequest {
	if x != nil {
		return x.SwapRequest
	}
	return nil
}

type TradeProposeReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SwapAccept     *swap.SwapAccept `protobuf:"bytes,1,opt,name=swap_accept,json=swapAccept,proto3" json:"swap_accept,omitempty"`
	SwapFail       *swap.SwapFail   `protobuf:"bytes,2,opt,name=swap_fail,json=swapFail,proto3" json:"swap_fail,omitempty"`
	ExpiryTimeUnix uint64           `protobuf:"varint,3,opt,name=expiry_time_unix,json=expiryTimeUnix,proto3" json:"expiry_time_unix,omitempty"`
}

func (x *TradeProposeReply) Reset() {
	*x = TradeProposeReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TradeProposeReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TradeProposeReply) ProtoMessage() {}

func (x *TradeProposeReply) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TradeProposeReply.ProtoReflect.Descriptor instead.
func (*TradeProposeReply) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{7}
}

func (x *TradeProposeReply) GetSwapAccept() *swap.SwapAccept {
	if x != nil {
		return x.SwapAccept
	}
	return nil
}

func (x *TradeProposeReply) GetSwapFail() *swap.SwapFail {
	if x != nil {
		return x.SwapFail
	}
	return nil
}

func (x *TradeProposeReply) GetExpiryTimeUnix() uint64 {
	if x != nil {
		return x.ExpiryTimeUnix
	}
	return 0
}

type TradeCompleteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SwapComplete *swap.SwapComplete `protobuf:"bytes,1,opt,name=swap_complete,json=swapComplete,proto3" json:"swap_complete,omitempty"`
	SwapFail     *swap.SwapFail     `protobuf:"bytes,2,opt,name=swap_fail,json=swapFail,proto3" json:"swap_fail,omitempty"`
}

func (x *TradeCompleteRequest) Reset() {
	*x = TradeCompleteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TradeCompleteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TradeCompleteRequest) ProtoMessage() {}

func (x *TradeCompleteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TradeCompleteRequest.ProtoReflect.Descriptor instead.
func (*TradeCompleteRequest) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{8}
}

func (x *TradeCompleteRequest) GetSwapComplete() *swap.SwapComplete {
	if x != nil {
		return x.SwapComplete
	}
	return nil
}

func (x *TradeCompleteRequest) GetSwapFail() *swap.SwapFail {
	if x != nil {
		return x.SwapFail
	}
	return nil
}

type TradeCompleteReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Txid     string         `protobuf:"bytes,1,opt,name=txid,proto3" json:"txid,omitempty"`
	SwapFail *swap.SwapFail `protobuf:"bytes,2,opt,name=swap_fail,json=swapFail,proto3" json:"swap_fail,omitempty"`
}

func (x *TradeCompleteReply) Reset() {
	*x = TradeCompleteReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_trade_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TradeCompleteReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TradeCompleteReply) ProtoMessage() {}

func (x *TradeCompleteReply) ProtoReflect() protoreflect.Message {
	mi := &file_trade_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TradeCompleteReply.ProtoReflect.Descriptor instead.
func (*TradeCompleteReply) Descriptor() ([]byte, []int) {
	return file_trade_proto_rawDescGZIP(), []int{9}
}

func (x *TradeCompleteReply) GetTxid() string {
	if x != nil {
		return x.Txid
	}
	return ""
}

func (x *TradeCompleteReply) GetSwapFail() *swap.SwapFail {
	if x != nil {
		return x.SwapFail
	}
	return nil
}

var File_trade_proto protoreflect.FileDescriptor

var file_trade_proto_rawDesc = []byte{
	0x0a, 0x0b, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0a, 0x73,
	0x77, 0x61, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0b, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x10, 0x0a, 0x0e, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x38, 0x0a, 0x0c, 0x4d, 0x61, 0x72, 0x6b,
	0x65, 0x74, 0x73, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x28, 0x0a, 0x07, 0x6d, 0x61, 0x72, 0x6b,
	0x65, 0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x4d, 0x61, 0x72, 0x6b,
	0x65, 0x74, 0x57, 0x69, 0x74, 0x68, 0x46, 0x65, 0x65, 0x52, 0x07, 0x6d, 0x61, 0x72, 0x6b, 0x65,
	0x74, 0x73, 0x22, 0x32, 0x0a, 0x0f, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x52, 0x06,
	0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x22, 0x3c, 0x0a, 0x0d, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63,
	0x65, 0x73, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x2b, 0x0a, 0x08, 0x62, 0x61, 0x6c, 0x61, 0x6e,
	0x63, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x42, 0x61, 0x6c, 0x61,
	0x6e, 0x63, 0x65, 0x57, 0x69, 0x74, 0x68, 0x46, 0x65, 0x65, 0x52, 0x08, 0x62, 0x61, 0x6c, 0x61,
	0x6e, 0x63, 0x65, 0x73, 0x22, 0x6d, 0x0a, 0x12, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x50, 0x72,
	0x69, 0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x6d, 0x61,
	0x72, 0x6b, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x4d, 0x61, 0x72,
	0x6b, 0x65, 0x74, 0x52, 0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x12, 0x1e, 0x0a, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x0a, 0x2e, 0x54, 0x72, 0x61, 0x64,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x61,
	0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x04, 0x52, 0x06, 0x61, 0x6d, 0x6f,
	0x75, 0x6e, 0x74, 0x22, 0x39, 0x0a, 0x10, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x50, 0x72, 0x69,
	0x63, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x25, 0x0a, 0x06, 0x70, 0x72, 0x69, 0x63, 0x65,
	0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x50, 0x72, 0x69, 0x63, 0x65, 0x57,
	0x69, 0x74, 0x68, 0x46, 0x65, 0x65, 0x52, 0x06, 0x70, 0x72, 0x69, 0x63, 0x65, 0x73, 0x22, 0x87,
	0x01, 0x0a, 0x13, 0x54, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x73, 0x65, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x07, 0x2e, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x52,
	0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x12, 0x1e, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x0a, 0x2e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x54, 0x79, 0x70,
	0x65, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x2f, 0x0a, 0x0c, 0x73, 0x77, 0x61, 0x70, 0x5f,
	0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0c, 0x2e,
	0x53, 0x77, 0x61, 0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x52, 0x0b, 0x73, 0x77, 0x61,
	0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x93, 0x01, 0x0a, 0x11, 0x54, 0x72, 0x61,
	0x64, 0x65, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x73, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x2c,
	0x0a, 0x0b, 0x73, 0x77, 0x61, 0x70, 0x5f, 0x61, 0x63, 0x63, 0x65, 0x70, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x0b, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x41, 0x63, 0x63, 0x65, 0x70, 0x74,
	0x52, 0x0a, 0x73, 0x77, 0x61, 0x70, 0x41, 0x63, 0x63, 0x65, 0x70, 0x74, 0x12, 0x26, 0x0a, 0x09,
	0x73, 0x77, 0x61, 0x70, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x09, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x46, 0x61, 0x69, 0x6c, 0x52, 0x08, 0x73, 0x77, 0x61, 0x70,
	0x46, 0x61, 0x69, 0x6c, 0x12, 0x28, 0x0a, 0x10, 0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x5f, 0x74,
	0x69, 0x6d, 0x65, 0x5f, 0x75, 0x6e, 0x69, 0x78, 0x18, 0x03, 0x20, 0x01, 0x28, 0x04, 0x52, 0x0e,
	0x65, 0x78, 0x70, 0x69, 0x72, 0x79, 0x54, 0x69, 0x6d, 0x65, 0x55, 0x6e, 0x69, 0x78, 0x22, 0x72,
	0x0a, 0x14, 0x54, 0x72, 0x61, 0x64, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x52,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x32, 0x0a, 0x0d, 0x73, 0x77, 0x61, 0x70, 0x5f, 0x63,
	0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0d, 0x2e,
	0x53, 0x77, 0x61, 0x70, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x0c, 0x73, 0x77,
	0x61, 0x70, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x26, 0x0a, 0x09, 0x73, 0x77,
	0x61, 0x70, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x09, 0x2e,
	0x53, 0x77, 0x61, 0x70, 0x46, 0x61, 0x69, 0x6c, 0x52, 0x08, 0x73, 0x77, 0x61, 0x70, 0x46, 0x61,
	0x69, 0x6c, 0x22, 0x50, 0x0a, 0x12, 0x54, 0x72, 0x61, 0x64, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c,
	0x65, 0x74, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x78, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x78, 0x69, 0x64, 0x12, 0x26, 0x0a, 0x09,
	0x73, 0x77, 0x61, 0x70, 0x5f, 0x66, 0x61, 0x69, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x09, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x46, 0x61, 0x69, 0x6c, 0x52, 0x08, 0x73, 0x77, 0x61, 0x70,
	0x46, 0x61, 0x69, 0x6c, 0x2a, 0x1e, 0x0a, 0x09, 0x54, 0x72, 0x61, 0x64, 0x65, 0x54, 0x79, 0x70,
	0x65, 0x12, 0x07, 0x0a, 0x03, 0x42, 0x55, 0x59, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x53, 0x45,
	0x4c, 0x4c, 0x10, 0x01, 0x32, 0x92, 0x02, 0x0a, 0x05, 0x54, 0x72, 0x61, 0x64, 0x65, 0x12, 0x29,
	0x0a, 0x07, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x73, 0x12, 0x0f, 0x2e, 0x4d, 0x61, 0x72, 0x6b,
	0x65, 0x74, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x0d, 0x2e, 0x4d, 0x61, 0x72,
	0x6b, 0x65, 0x74, 0x73, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x2c, 0x0a, 0x08, 0x42, 0x61, 0x6c,
	0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x10, 0x2e, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x73,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x0e, 0x2e, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63,
	0x65, 0x73, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x35, 0x0a, 0x0b, 0x4d, 0x61, 0x72, 0x6b, 0x65,
	0x74, 0x50, 0x72, 0x69, 0x63, 0x65, 0x12, 0x13, 0x2e, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x50,
	0x72, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x11, 0x2e, 0x4d, 0x61,
	0x72, 0x6b, 0x65, 0x74, 0x50, 0x72, 0x69, 0x63, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x3a,
	0x0a, 0x0c, 0x54, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x73, 0x65, 0x12, 0x14,
	0x2e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x6f, 0x70, 0x6f, 0x73, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x50, 0x72, 0x6f, 0x70,
	0x6f, 0x73, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x30, 0x01, 0x12, 0x3d, 0x0a, 0x0d, 0x54, 0x72,
	0x61, 0x64, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x15, 0x2e, 0x54, 0x72,
	0x61, 0x64, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x13, 0x2e, 0x54, 0x72, 0x61, 0x64, 0x65, 0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65,
	0x74, 0x65, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x30, 0x01, 0x42, 0x3a, 0x5a, 0x38, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d, 0x6e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2f, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x64, 0x2f, 0x67, 0x6f, 0x2f,
	0x74, 0x72, 0x61, 0x64, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_trade_proto_rawDescOnce sync.Once
	file_trade_proto_rawDescData = file_trade_proto_rawDesc
)

func file_trade_proto_rawDescGZIP() []byte {
	file_trade_proto_rawDescOnce.Do(func() {
		file_trade_proto_rawDescData = protoimpl.X.CompressGZIP(file_trade_proto_rawDescData)
	})
	return file_trade_proto_rawDescData
}

var file_trade_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_trade_proto_msgTypes = make([]protoimpl.MessageInfo, 10)
var file_trade_proto_goTypes = []interface{}{
	(TradeType)(0),               // 0: TradeType
	(*MarketsRequest)(nil),       // 1: MarketsRequest
	(*MarketsReply)(nil),         // 2: MarketsReply
	(*BalancesRequest)(nil),      // 3: BalancesRequest
	(*BalancesReply)(nil),        // 4: BalancesReply
	(*MarketPriceRequest)(nil),   // 5: MarketPriceRequest
	(*MarketPriceReply)(nil),     // 6: MarketPriceReply
	(*TradeProposeRequest)(nil),  // 7: TradeProposeRequest
	(*TradeProposeReply)(nil),    // 8: TradeProposeReply
	(*TradeCompleteRequest)(nil), // 9: TradeCompleteRequest
	(*TradeCompleteReply)(nil),   // 10: TradeCompleteReply
	(*types.MarketWithFee)(nil),  // 11: MarketWithFee
	(*types.Market)(nil),         // 12: Market
	(*types.BalanceWithFee)(nil), // 13: BalanceWithFee
	(*types.PriceWithFee)(nil),   // 14: PriceWithFee
	(*swap.SwapRequest)(nil),     // 15: SwapRequest
	(*swap.SwapAccept)(nil),      // 16: SwapAccept
	(*swap.SwapFail)(nil),        // 17: SwapFail
	(*swap.SwapComplete)(nil),    // 18: SwapComplete
}
var file_trade_proto_depIdxs = []int32{
	11, // 0: MarketsReply.markets:type_name -> MarketWithFee
	12, // 1: BalancesRequest.market:type_name -> Market
	13, // 2: BalancesReply.balances:type_name -> BalanceWithFee
	12, // 3: MarketPriceRequest.market:type_name -> Market
	0,  // 4: MarketPriceRequest.type:type_name -> TradeType
	14, // 5: MarketPriceReply.prices:type_name -> PriceWithFee
	12, // 6: TradeProposeRequest.market:type_name -> Market
	0,  // 7: TradeProposeRequest.type:type_name -> TradeType
	15, // 8: TradeProposeRequest.swap_request:type_name -> SwapRequest
	16, // 9: TradeProposeReply.swap_accept:type_name -> SwapAccept
	17, // 10: TradeProposeReply.swap_fail:type_name -> SwapFail
	18, // 11: TradeCompleteRequest.swap_complete:type_name -> SwapComplete
	17, // 12: TradeCompleteRequest.swap_fail:type_name -> SwapFail
	17, // 13: TradeCompleteReply.swap_fail:type_name -> SwapFail
	1,  // 14: Trade.Markets:input_type -> MarketsRequest
	3,  // 15: Trade.Balances:input_type -> BalancesRequest
	5,  // 16: Trade.MarketPrice:input_type -> MarketPriceRequest
	7,  // 17: Trade.TradePropose:input_type -> TradeProposeRequest
	9,  // 18: Trade.TradeComplete:input_type -> TradeCompleteRequest
	2,  // 19: Trade.Markets:output_type -> MarketsReply
	4,  // 20: Trade.Balances:output_type -> BalancesReply
	6,  // 21: Trade.MarketPrice:output_type -> MarketPriceReply
	8,  // 22: Trade.TradePropose:output_type -> TradeProposeReply
	10, // 23: Trade.TradeComplete:output_type -> TradeCompleteReply
	19, // [19:24] is the sub-list for method output_type
	14, // [14:19] is the sub-list for method input_type
	14, // [14:14] is the sub-list for extension type_name
	14, // [14:14] is the sub-list for extension extendee
	0,  // [0:14] is the sub-list for field type_name
}

func init() { file_trade_proto_init() }
func file_trade_proto_init() {
	if File_trade_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_trade_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MarketsRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MarketsReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BalancesRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BalancesReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MarketPriceRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MarketPriceReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TradeProposeRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TradeProposeReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TradeCompleteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_trade_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TradeCompleteReply); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_trade_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   10,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_trade_proto_goTypes,
		DependencyIndexes: file_trade_proto_depIdxs,
		EnumInfos:         file_trade_proto_enumTypes,
		MessageInfos:      file_trade_proto_msgTypes,
	}.Build()
	File_trade_proto = out.File
	file_trade_proto_rawDesc = nil
	file_trade_proto_goTypes = nil
	file_trade_proto_depIdxs = nil
}
