// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        (unknown)
// source: v2/types.proto

package tdextradev2

import (
	_ "google.golang.org/genproto/googleapis/api/annotations"
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

// Custom Types
type Fee struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BasisPoint int64  `protobuf:"varint,2,opt,name=basis_point,json=basisPoint,proto3" json:"basis_point,omitempty"`
	Fixed      *Fixed `protobuf:"bytes,3,opt,name=fixed,proto3" json:"fixed,omitempty"`
}

func (x *Fee) Reset() {
	*x = Fee{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Fee) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Fee) ProtoMessage() {}

func (x *Fee) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Fee.ProtoReflect.Descriptor instead.
func (*Fee) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{0}
}

func (x *Fee) GetBasisPoint() int64 {
	if x != nil {
		return x.BasisPoint
	}
	return 0
}

func (x *Fee) GetFixed() *Fixed {
	if x != nil {
		return x.Fixed
	}
	return nil
}

type Fixed struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BaseFee  int64 `protobuf:"varint,1,opt,name=base_fee,json=baseFee,proto3" json:"base_fee,omitempty"`
	QuoteFee int64 `protobuf:"varint,2,opt,name=quote_fee,json=quoteFee,proto3" json:"quote_fee,omitempty"`
}

func (x *Fixed) Reset() {
	*x = Fixed{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Fixed) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Fixed) ProtoMessage() {}

func (x *Fixed) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Fixed.ProtoReflect.Descriptor instead.
func (*Fixed) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{1}
}

func (x *Fixed) GetBaseFee() int64 {
	if x != nil {
		return x.BaseFee
	}
	return 0
}

func (x *Fixed) GetQuoteFee() int64 {
	if x != nil {
		return x.QuoteFee
	}
	return 0
}

type Balance struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BaseAmount  uint64 `protobuf:"varint,1,opt,name=base_amount,json=baseAmount,proto3" json:"base_amount,omitempty"`
	QuoteAmount uint64 `protobuf:"varint,2,opt,name=quote_amount,json=quoteAmount,proto3" json:"quote_amount,omitempty"`
}

func (x *Balance) Reset() {
	*x = Balance{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Balance) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Balance) ProtoMessage() {}

func (x *Balance) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Balance.ProtoReflect.Descriptor instead.
func (*Balance) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{2}
}

func (x *Balance) GetBaseAmount() uint64 {
	if x != nil {
		return x.BaseAmount
	}
	return 0
}

func (x *Balance) GetQuoteAmount() uint64 {
	if x != nil {
		return x.QuoteAmount
	}
	return 0
}

type BalanceWithFee struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Balance *Balance `protobuf:"bytes,1,opt,name=balance,proto3" json:"balance,omitempty"`
	Fee     *Fee     `protobuf:"bytes,2,opt,name=fee,proto3" json:"fee,omitempty"`
}

func (x *BalanceWithFee) Reset() {
	*x = BalanceWithFee{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BalanceWithFee) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BalanceWithFee) ProtoMessage() {}

func (x *BalanceWithFee) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BalanceWithFee.ProtoReflect.Descriptor instead.
func (*BalanceWithFee) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{3}
}

func (x *BalanceWithFee) GetBalance() *Balance {
	if x != nil {
		return x.Balance
	}
	return nil
}

func (x *BalanceWithFee) GetFee() *Fee {
	if x != nil {
		return x.Fee
	}
	return nil
}

type Market struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BaseAsset  string `protobuf:"bytes,1,opt,name=base_asset,json=baseAsset,proto3" json:"base_asset,omitempty"`
	QuoteAsset string `protobuf:"bytes,2,opt,name=quote_asset,json=quoteAsset,proto3" json:"quote_asset,omitempty"`
}

func (x *Market) Reset() {
	*x = Market{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Market) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Market) ProtoMessage() {}

func (x *Market) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Market.ProtoReflect.Descriptor instead.
func (*Market) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{4}
}

func (x *Market) GetBaseAsset() string {
	if x != nil {
		return x.BaseAsset
	}
	return ""
}

func (x *Market) GetQuoteAsset() string {
	if x != nil {
		return x.QuoteAsset
	}
	return ""
}

type MarketWithFee struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Market *Market `protobuf:"bytes,1,opt,name=market,proto3" json:"market,omitempty"`
	Fee    *Fee    `protobuf:"bytes,2,opt,name=fee,proto3" json:"fee,omitempty"`
}

func (x *MarketWithFee) Reset() {
	*x = MarketWithFee{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MarketWithFee) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MarketWithFee) ProtoMessage() {}

func (x *MarketWithFee) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MarketWithFee.ProtoReflect.Descriptor instead.
func (*MarketWithFee) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{5}
}

func (x *MarketWithFee) GetMarket() *Market {
	if x != nil {
		return x.Market
	}
	return nil
}

func (x *MarketWithFee) GetFee() *Fee {
	if x != nil {
		return x.Fee
	}
	return nil
}

type Price struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	BasePriceDeprecated  float32 `protobuf:"fixed32,1,opt,name=base_price_deprecated,json=basePriceDeprecated,proto3" json:"base_price_deprecated,omitempty"`
	QuotePriceDeprecated float32 `protobuf:"fixed32,2,opt,name=quote_price_deprecated,json=quotePriceDeprecated,proto3" json:"quote_price_deprecated,omitempty"`
	BasePrice            float64 `protobuf:"fixed64,3,opt,name=base_price,json=basePrice,proto3" json:"base_price,omitempty"`
	QuotePrice           float64 `protobuf:"fixed64,4,opt,name=quote_price,json=quotePrice,proto3" json:"quote_price,omitempty"`
}

func (x *Price) Reset() {
	*x = Price{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Price) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Price) ProtoMessage() {}

func (x *Price) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Price.ProtoReflect.Descriptor instead.
func (*Price) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{6}
}

func (x *Price) GetBasePriceDeprecated() float32 {
	if x != nil {
		return x.BasePriceDeprecated
	}
	return 0
}

func (x *Price) GetQuotePriceDeprecated() float32 {
	if x != nil {
		return x.QuotePriceDeprecated
	}
	return 0
}

func (x *Price) GetBasePrice() float64 {
	if x != nil {
		return x.BasePrice
	}
	return 0
}

func (x *Price) GetQuotePrice() float64 {
	if x != nil {
		return x.QuotePrice
	}
	return 0
}

type PriceWithFee struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Price   *Price   `protobuf:"bytes,1,opt,name=price,proto3" json:"price,omitempty"`
	Fee     *Fee     `protobuf:"bytes,2,opt,name=fee,proto3" json:"fee,omitempty"`
	Amount  uint64   `protobuf:"varint,3,opt,name=amount,proto3" json:"amount,omitempty"`
	Asset   string   `protobuf:"bytes,4,opt,name=asset,proto3" json:"asset,omitempty"`
	Balance *Balance `protobuf:"bytes,5,opt,name=balance,proto3" json:"balance,omitempty"`
}

func (x *PriceWithFee) Reset() {
	*x = PriceWithFee{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PriceWithFee) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PriceWithFee) ProtoMessage() {}

func (x *PriceWithFee) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PriceWithFee.ProtoReflect.Descriptor instead.
func (*PriceWithFee) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{7}
}

func (x *PriceWithFee) GetPrice() *Price {
	if x != nil {
		return x.Price
	}
	return nil
}

func (x *PriceWithFee) GetFee() *Fee {
	if x != nil {
		return x.Fee
	}
	return nil
}

func (x *PriceWithFee) GetAmount() uint64 {
	if x != nil {
		return x.Amount
	}
	return 0
}

func (x *PriceWithFee) GetAsset() string {
	if x != nil {
		return x.Asset
	}
	return ""
}

func (x *PriceWithFee) GetBalance() *Balance {
	if x != nil {
		return x.Balance
	}
	return nil
}

type AddressWithBlindingKey struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The confidential address encoded using a blech32 format.
	Address string `protobuf:"bytes,1,opt,name=address,proto3" json:"address,omitempty"`
	// The blinding private key for the given address encoded in hex format
	Blinding string `protobuf:"bytes,2,opt,name=blinding,proto3" json:"blinding,omitempty"`
}

func (x *AddressWithBlindingKey) Reset() {
	*x = AddressWithBlindingKey{}
	if protoimpl.UnsafeEnabled {
		mi := &file_v2_types_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AddressWithBlindingKey) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AddressWithBlindingKey) ProtoMessage() {}

func (x *AddressWithBlindingKey) ProtoReflect() protoreflect.Message {
	mi := &file_v2_types_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AddressWithBlindingKey.ProtoReflect.Descriptor instead.
func (*AddressWithBlindingKey) Descriptor() ([]byte, []int) {
	return file_v2_types_proto_rawDescGZIP(), []int{8}
}

func (x *AddressWithBlindingKey) GetAddress() string {
	if x != nil {
		return x.Address
	}
	return ""
}

func (x *AddressWithBlindingKey) GetBlinding() string {
	if x != nil {
		return x.Blinding
	}
	return ""
}

var File_v2_types_proto protoreflect.FileDescriptor

var file_v2_types_proto_rawDesc = []byte{
	0x0a, 0x0e, 0x76, 0x32, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x0c, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x1a, 0x1c,
	0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x51, 0x0a, 0x03,
	0x46, 0x65, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x62, 0x61, 0x73, 0x69, 0x73, 0x5f, 0x70, 0x6f, 0x69,
	0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x62, 0x61, 0x73, 0x69, 0x73, 0x50,
	0x6f, 0x69, 0x6e, 0x74, 0x12, 0x29, 0x0a, 0x05, 0x66, 0x69, 0x78, 0x65, 0x64, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e,
	0x76, 0x32, 0x2e, 0x46, 0x69, 0x78, 0x65, 0x64, 0x52, 0x05, 0x66, 0x69, 0x78, 0x65, 0x64, 0x22,
	0x3f, 0x0a, 0x05, 0x46, 0x69, 0x78, 0x65, 0x64, 0x12, 0x19, 0x0a, 0x08, 0x62, 0x61, 0x73, 0x65,
	0x5f, 0x66, 0x65, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x62, 0x61, 0x73, 0x65,
	0x46, 0x65, 0x65, 0x12, 0x1b, 0x0a, 0x09, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x5f, 0x66, 0x65, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x46, 0x65, 0x65,
	0x22, 0x4d, 0x0a, 0x07, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x62,
	0x61, 0x73, 0x65, 0x5f, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x04,
	0x52, 0x0a, 0x62, 0x61, 0x73, 0x65, 0x41, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x21, 0x0a, 0x0c,
	0x71, 0x75, 0x6f, 0x74, 0x65, 0x5f, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x04, 0x52, 0x0b, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x41, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x22,
	0x66, 0x0a, 0x0e, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x57, 0x69, 0x74, 0x68, 0x46, 0x65,
	0x65, 0x12, 0x2f, 0x0a, 0x07, 0x62, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x15, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76,
	0x32, 0x2e, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x52, 0x07, 0x62, 0x61, 0x6c, 0x61, 0x6e,
	0x63, 0x65, 0x12, 0x23, 0x0a, 0x03, 0x66, 0x65, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x11, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x46,
	0x65, 0x65, 0x52, 0x03, 0x66, 0x65, 0x65, 0x22, 0x48, 0x0a, 0x06, 0x4d, 0x61, 0x72, 0x6b, 0x65,
	0x74, 0x12, 0x1d, 0x0a, 0x0a, 0x62, 0x61, 0x73, 0x65, 0x5f, 0x61, 0x73, 0x73, 0x65, 0x74, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x62, 0x61, 0x73, 0x65, 0x41, 0x73, 0x73, 0x65, 0x74,
	0x12, 0x1f, 0x0a, 0x0b, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x5f, 0x61, 0x73, 0x73, 0x65, 0x74, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x41, 0x73, 0x73, 0x65,
	0x74, 0x22, 0x62, 0x0a, 0x0d, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x57, 0x69, 0x74, 0x68, 0x46,
	0x65, 0x65, 0x12, 0x2c, 0x0a, 0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x14, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76,
	0x32, 0x2e, 0x4d, 0x61, 0x72, 0x6b, 0x65, 0x74, 0x52, 0x06, 0x6d, 0x61, 0x72, 0x6b, 0x65, 0x74,
	0x12, 0x23, 0x0a, 0x03, 0x66, 0x65, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e,
	0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x46, 0x65, 0x65,
	0x52, 0x03, 0x66, 0x65, 0x65, 0x22, 0xb1, 0x01, 0x0a, 0x05, 0x50, 0x72, 0x69, 0x63, 0x65, 0x12,
	0x32, 0x0a, 0x15, 0x62, 0x61, 0x73, 0x65, 0x5f, 0x70, 0x72, 0x69, 0x63, 0x65, 0x5f, 0x64, 0x65,
	0x70, 0x72, 0x65, 0x63, 0x61, 0x74, 0x65, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x02, 0x52, 0x13,
	0x62, 0x61, 0x73, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65, 0x44, 0x65, 0x70, 0x72, 0x65, 0x63, 0x61,
	0x74, 0x65, 0x64, 0x12, 0x34, 0x0a, 0x16, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x5f, 0x70, 0x72, 0x69,
	0x63, 0x65, 0x5f, 0x64, 0x65, 0x70, 0x72, 0x65, 0x63, 0x61, 0x74, 0x65, 0x64, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x02, 0x52, 0x14, 0x71, 0x75, 0x6f, 0x74, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65, 0x44,
	0x65, 0x70, 0x72, 0x65, 0x63, 0x61, 0x74, 0x65, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x62, 0x61, 0x73,
	0x65, 0x5f, 0x70, 0x72, 0x69, 0x63, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x01, 0x52, 0x09, 0x62,
	0x61, 0x73, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x71, 0x75, 0x6f, 0x74,
	0x65, 0x5f, 0x70, 0x72, 0x69, 0x63, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x01, 0x52, 0x0a, 0x71,
	0x75, 0x6f, 0x74, 0x65, 0x50, 0x72, 0x69, 0x63, 0x65, 0x22, 0xbd, 0x01, 0x0a, 0x0c, 0x50, 0x72,
	0x69, 0x63, 0x65, 0x57, 0x69, 0x74, 0x68, 0x46, 0x65, 0x65, 0x12, 0x29, 0x0a, 0x05, 0x70, 0x72,
	0x69, 0x63, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x74, 0x64, 0x65, 0x78,
	0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x50, 0x72, 0x69, 0x63, 0x65, 0x52, 0x05,
	0x70, 0x72, 0x69, 0x63, 0x65, 0x12, 0x23, 0x0a, 0x03, 0x66, 0x65, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x11, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76,
	0x32, 0x2e, 0x46, 0x65, 0x65, 0x52, 0x03, 0x66, 0x65, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x61, 0x6d,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x04, 0x52, 0x06, 0x61, 0x6d, 0x6f, 0x75,
	0x6e, 0x74, 0x12, 0x14, 0x0a, 0x05, 0x61, 0x73, 0x73, 0x65, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x05, 0x61, 0x73, 0x73, 0x65, 0x74, 0x12, 0x2f, 0x0a, 0x07, 0x62, 0x61, 0x6c, 0x61,
	0x6e, 0x63, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x74, 0x64, 0x65, 0x78,
	0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x2e, 0x42, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65,
	0x52, 0x07, 0x62, 0x61, 0x6c, 0x61, 0x6e, 0x63, 0x65, 0x22, 0x4e, 0x0a, 0x16, 0x41, 0x64, 0x64,
	0x72, 0x65, 0x73, 0x73, 0x57, 0x69, 0x74, 0x68, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67,
	0x4b, 0x65, 0x79, 0x12, 0x18, 0x0a, 0x07, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x1a, 0x0a,
	0x08, 0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x08, 0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x42, 0xbc, 0x01, 0x0a, 0x10, 0x63, 0x6f,
	0x6d, 0x2e, 0x74, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x76, 0x32, 0x42, 0x0a,
	0x54, 0x79, 0x70, 0x65, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x4b, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d, 0x6e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x74, 0x62, 0x75, 0x66, 0x2f, 0x61, 0x70, 0x69, 0x2d, 0x73, 0x70, 0x65, 0x63, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x65, 0x6e, 0x2f, 0x76, 0x32, 0x3b, 0x74, 0x64,
	0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x76, 0x32, 0xa2, 0x02, 0x03, 0x54, 0x58, 0x58, 0xaa,
	0x02, 0x0c, 0x54, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x2e, 0x56, 0x32, 0xca, 0x02,
	0x0c, 0x54, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x5c, 0x56, 0x32, 0xe2, 0x02, 0x18,
	0x54, 0x64, 0x65, 0x78, 0x74, 0x72, 0x61, 0x64, 0x65, 0x5c, 0x56, 0x32, 0x5c, 0x47, 0x50, 0x42,
	0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x0d, 0x54, 0x64, 0x65, 0x78, 0x74,
	0x72, 0x61, 0x64, 0x65, 0x3a, 0x3a, 0x56, 0x32, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_v2_types_proto_rawDescOnce sync.Once
	file_v2_types_proto_rawDescData = file_v2_types_proto_rawDesc
)

func file_v2_types_proto_rawDescGZIP() []byte {
	file_v2_types_proto_rawDescOnce.Do(func() {
		file_v2_types_proto_rawDescData = protoimpl.X.CompressGZIP(file_v2_types_proto_rawDescData)
	})
	return file_v2_types_proto_rawDescData
}

var file_v2_types_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_v2_types_proto_goTypes = []interface{}{
	(*Fee)(nil),                    // 0: tdextrade.v2.Fee
	(*Fixed)(nil),                  // 1: tdextrade.v2.Fixed
	(*Balance)(nil),                // 2: tdextrade.v2.Balance
	(*BalanceWithFee)(nil),         // 3: tdextrade.v2.BalanceWithFee
	(*Market)(nil),                 // 4: tdextrade.v2.Market
	(*MarketWithFee)(nil),          // 5: tdextrade.v2.MarketWithFee
	(*Price)(nil),                  // 6: tdextrade.v2.Price
	(*PriceWithFee)(nil),           // 7: tdextrade.v2.PriceWithFee
	(*AddressWithBlindingKey)(nil), // 8: tdextrade.v2.AddressWithBlindingKey
}
var file_v2_types_proto_depIdxs = []int32{
	1, // 0: tdextrade.v2.Fee.fixed:type_name -> tdextrade.v2.Fixed
	2, // 1: tdextrade.v2.BalanceWithFee.balance:type_name -> tdextrade.v2.Balance
	0, // 2: tdextrade.v2.BalanceWithFee.fee:type_name -> tdextrade.v2.Fee
	4, // 3: tdextrade.v2.MarketWithFee.market:type_name -> tdextrade.v2.Market
	0, // 4: tdextrade.v2.MarketWithFee.fee:type_name -> tdextrade.v2.Fee
	6, // 5: tdextrade.v2.PriceWithFee.price:type_name -> tdextrade.v2.Price
	0, // 6: tdextrade.v2.PriceWithFee.fee:type_name -> tdextrade.v2.Fee
	2, // 7: tdextrade.v2.PriceWithFee.balance:type_name -> tdextrade.v2.Balance
	8, // [8:8] is the sub-list for method output_type
	8, // [8:8] is the sub-list for method input_type
	8, // [8:8] is the sub-list for extension type_name
	8, // [8:8] is the sub-list for extension extendee
	0, // [0:8] is the sub-list for field type_name
}

func init() { file_v2_types_proto_init() }
func file_v2_types_proto_init() {
	if File_v2_types_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_v2_types_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Fee); i {
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
		file_v2_types_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Fixed); i {
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
		file_v2_types_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Balance); i {
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
		file_v2_types_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BalanceWithFee); i {
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
		file_v2_types_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Market); i {
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
		file_v2_types_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MarketWithFee); i {
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
		file_v2_types_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Price); i {
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
		file_v2_types_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PriceWithFee); i {
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
		file_v2_types_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AddressWithBlindingKey); i {
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
			RawDescriptor: file_v2_types_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_v2_types_proto_goTypes,
		DependencyIndexes: file_v2_types_proto_depIdxs,
		MessageInfos:      file_v2_types_proto_msgTypes,
	}.Build()
	File_v2_types_proto = out.File
	file_v2_types_proto_rawDesc = nil
	file_v2_types_proto_goTypes = nil
	file_v2_types_proto_depIdxs = nil
}
