// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: swap.proto

package swap

import (
	proto "github.com/golang/protobuf/proto"
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

type SwapRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The proposer's quantity
	AmountP uint64 `protobuf:"varint,2,opt,name=amount_p,json=amountP,proto3" json:"amount_p,omitempty"`
	// The proposer's asset hash
	AssetP string `protobuf:"bytes,3,opt,name=asset_p,json=assetP,proto3" json:"asset_p,omitempty"`
	// The responder's quantity
	AmountR uint64 `protobuf:"varint,4,opt,name=amount_r,json=amountR,proto3" json:"amount_r,omitempty"`
	// The responder's asset hash
	AssetR string `protobuf:"bytes,5,opt,name=asset_r,json=assetR,proto3" json:"asset_r,omitempty"`
	// The proposer's unsigned transaction in PSBT format (base64 string)
	Transaction string `protobuf:"bytes,6,opt,name=transaction,proto3" json:"transaction,omitempty"`
	// In case of a confidential transaction the blinding key of each confidential
	// input is included. Each blinding key is identified by the prevout script
	// hex encoded.
	InputBlindingKey map[string][]byte `protobuf:"bytes,7,rep,name=input_blinding_key,json=inputBlindingKey,proto3" json:"input_blinding_key,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// In case of a confidential transaction the blinding key of each confidential
	// output is included. Each blinding key is identified by the output script
	// hex encoded.
	OutputBlindingKey map[string][]byte `protobuf:"bytes,8,rep,name=output_blinding_key,json=outputBlindingKey,proto3" json:"output_blinding_key,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
}

func (x *SwapRequest) Reset() {
	*x = SwapRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_swap_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SwapRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SwapRequest) ProtoMessage() {}

func (x *SwapRequest) ProtoReflect() protoreflect.Message {
	mi := &file_swap_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SwapRequest.ProtoReflect.Descriptor instead.
func (*SwapRequest) Descriptor() ([]byte, []int) {
	return file_swap_proto_rawDescGZIP(), []int{0}
}

func (x *SwapRequest) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SwapRequest) GetAmountP() uint64 {
	if x != nil {
		return x.AmountP
	}
	return 0
}

func (x *SwapRequest) GetAssetP() string {
	if x != nil {
		return x.AssetP
	}
	return ""
}

func (x *SwapRequest) GetAmountR() uint64 {
	if x != nil {
		return x.AmountR
	}
	return 0
}

func (x *SwapRequest) GetAssetR() string {
	if x != nil {
		return x.AssetR
	}
	return ""
}

func (x *SwapRequest) GetTransaction() string {
	if x != nil {
		return x.Transaction
	}
	return ""
}

func (x *SwapRequest) GetInputBlindingKey() map[string][]byte {
	if x != nil {
		return x.InputBlindingKey
	}
	return nil
}

func (x *SwapRequest) GetOutputBlindingKey() map[string][]byte {
	if x != nil {
		return x.OutputBlindingKey
	}
	return nil
}

type SwapAccept struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// indetifier of the SwapRequest message
	RequestId string `protobuf:"bytes,2,opt,name=request_id,json=requestId,proto3" json:"request_id,omitempty"`
	// The partial signed transaction base64 encoded containing the Responder's
	// signed inputs in a PSBT format
	Transaction string `protobuf:"bytes,3,opt,name=transaction,proto3" json:"transaction,omitempty"`
	// In case of a confidential transaction the blinding key of each confidential
	// input is included. Each blinding key is identified by the prevout script
	// hex encoded.
	InputBlindingKey map[string][]byte `protobuf:"bytes,4,rep,name=input_blinding_key,json=inputBlindingKey,proto3" json:"input_blinding_key,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// In case of a confidential transaction the blinding key of each confidential
	// output is included. Each blinding key is identified by the output script
	// hex encoded.
	OutputBlindingKey map[string][]byte `protobuf:"bytes,5,rep,name=output_blinding_key,json=outputBlindingKey,proto3" json:"output_blinding_key,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
}

func (x *SwapAccept) Reset() {
	*x = SwapAccept{}
	if protoimpl.UnsafeEnabled {
		mi := &file_swap_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SwapAccept) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SwapAccept) ProtoMessage() {}

func (x *SwapAccept) ProtoReflect() protoreflect.Message {
	mi := &file_swap_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SwapAccept.ProtoReflect.Descriptor instead.
func (*SwapAccept) Descriptor() ([]byte, []int) {
	return file_swap_proto_rawDescGZIP(), []int{1}
}

func (x *SwapAccept) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SwapAccept) GetRequestId() string {
	if x != nil {
		return x.RequestId
	}
	return ""
}

func (x *SwapAccept) GetTransaction() string {
	if x != nil {
		return x.Transaction
	}
	return ""
}

func (x *SwapAccept) GetInputBlindingKey() map[string][]byte {
	if x != nil {
		return x.InputBlindingKey
	}
	return nil
}

func (x *SwapAccept) GetOutputBlindingKey() map[string][]byte {
	if x != nil {
		return x.OutputBlindingKey
	}
	return nil
}

type SwapComplete struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// indetifier of the SwapAccept message
	AcceptId string `protobuf:"bytes,2,opt,name=accept_id,json=acceptId,proto3" json:"accept_id,omitempty"`
	// The signed transaction base64 encoded containing the Proposers's signed
	// inputs in a PSBT format
	Transaction string `protobuf:"bytes,3,opt,name=transaction,proto3" json:"transaction,omitempty"`
}

func (x *SwapComplete) Reset() {
	*x = SwapComplete{}
	if protoimpl.UnsafeEnabled {
		mi := &file_swap_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SwapComplete) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SwapComplete) ProtoMessage() {}

func (x *SwapComplete) ProtoReflect() protoreflect.Message {
	mi := &file_swap_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SwapComplete.ProtoReflect.Descriptor instead.
func (*SwapComplete) Descriptor() ([]byte, []int) {
	return file_swap_proto_rawDescGZIP(), []int{2}
}

func (x *SwapComplete) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SwapComplete) GetAcceptId() string {
	if x != nil {
		return x.AcceptId
	}
	return ""
}

func (x *SwapComplete) GetTransaction() string {
	if x != nil {
		return x.Transaction
	}
	return ""
}

type SwapFail struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Random unique identifier for the current message
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// indetifier of either SwapRequest or SwapAccept message. It can be empty
	MessageId string `protobuf:"bytes,2,opt,name=message_id,json=messageId,proto3" json:"message_id,omitempty"`
	// The failure code. It can be empty
	FailureCode uint32 `protobuf:"varint,3,opt,name=failure_code,json=failureCode,proto3" json:"failure_code,omitempty"`
	// The failure reason messaged
	FailureMessage string `protobuf:"bytes,4,opt,name=failure_message,json=failureMessage,proto3" json:"failure_message,omitempty"`
}

func (x *SwapFail) Reset() {
	*x = SwapFail{}
	if protoimpl.UnsafeEnabled {
		mi := &file_swap_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SwapFail) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SwapFail) ProtoMessage() {}

func (x *SwapFail) ProtoReflect() protoreflect.Message {
	mi := &file_swap_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SwapFail.ProtoReflect.Descriptor instead.
func (*SwapFail) Descriptor() ([]byte, []int) {
	return file_swap_proto_rawDescGZIP(), []int{3}
}

func (x *SwapFail) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SwapFail) GetMessageId() string {
	if x != nil {
		return x.MessageId
	}
	return ""
}

func (x *SwapFail) GetFailureCode() uint32 {
	if x != nil {
		return x.FailureCode
	}
	return 0
}

func (x *SwapFail) GetFailureMessage() string {
	if x != nil {
		return x.FailureMessage
	}
	return ""
}

var File_swap_proto protoreflect.FileDescriptor

var file_swap_proto_rawDesc = []byte{
	0x0a, 0x0a, 0x73, 0x77, 0x61, 0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xd9, 0x03, 0x0a,
	0x0b, 0x53, 0x77, 0x61, 0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x19, 0x0a, 0x08,
	0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x5f, 0x70, 0x18, 0x02, 0x20, 0x01, 0x28, 0x04, 0x52, 0x07,
	0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x50, 0x12, 0x17, 0x0a, 0x07, 0x61, 0x73, 0x73, 0x65, 0x74,
	0x5f, 0x70, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x61, 0x73, 0x73, 0x65, 0x74, 0x50,
	0x12, 0x19, 0x0a, 0x08, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x5f, 0x72, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x04, 0x52, 0x07, 0x61, 0x6d, 0x6f, 0x75, 0x6e, 0x74, 0x52, 0x12, 0x17, 0x0a, 0x07, 0x61,
	0x73, 0x73, 0x65, 0x74, 0x5f, 0x72, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x61, 0x73,
	0x73, 0x65, 0x74, 0x52, 0x12, 0x20, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73,
	0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x50, 0x0a, 0x12, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x5f,
	0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6b, 0x65, 0x79, 0x18, 0x07, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x22, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65,
	0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x10, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69,
	0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x12, 0x53, 0x0a, 0x13, 0x6f, 0x75, 0x74, 0x70,
	0x75, 0x74, 0x5f, 0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6b, 0x65, 0x79, 0x18,
	0x08, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x23, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x4f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x4b, 0x65, 0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x11, 0x6f, 0x75, 0x74, 0x70,
	0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x1a, 0x43, 0x0a,
	0x15, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65,
	0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02,
	0x38, 0x01, 0x1a, 0x44, 0x0a, 0x16, 0x4f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e,
	0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03,
	0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14,
	0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x76,
	0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0x8d, 0x03, 0x0a, 0x0a, 0x53, 0x77, 0x61,
	0x70, 0x41, 0x63, 0x63, 0x65, 0x70, 0x74, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x74, 0x72, 0x61,
	0x6e, 0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x4f, 0x0a, 0x12, 0x69, 0x6e, 0x70, 0x75,
	0x74, 0x5f, 0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6b, 0x65, 0x79, 0x18, 0x04,
	0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x41, 0x63, 0x63, 0x65, 0x70,
	0x74, 0x2e, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b,
	0x65, 0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x10, 0x69, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c,
	0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x12, 0x52, 0x0a, 0x13, 0x6f, 0x75, 0x74,
	0x70, 0x75, 0x74, 0x5f, 0x62, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6b, 0x65, 0x79,
	0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x53, 0x77, 0x61, 0x70, 0x41, 0x63, 0x63,
	0x65, 0x70, 0x74, 0x2e, 0x4f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x4b, 0x65, 0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x11, 0x6f, 0x75, 0x74, 0x70,
	0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x1a, 0x43, 0x0a,
	0x15, 0x49, 0x6e, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65,
	0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02,
	0x38, 0x01, 0x1a, 0x44, 0x0a, 0x16, 0x4f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x42, 0x6c, 0x69, 0x6e,
	0x64, 0x69, 0x6e, 0x67, 0x4b, 0x65, 0x79, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03,
	0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14,
	0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x05, 0x76,
	0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0x5d, 0x0a, 0x0c, 0x53, 0x77, 0x61, 0x70,
	0x43, 0x6f, 0x6d, 0x70, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x1b, 0x0a, 0x09, 0x61, 0x63, 0x63, 0x65,
	0x70, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x61, 0x63, 0x63,
	0x65, 0x70, 0x74, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0b, 0x74, 0x72, 0x61, 0x6e, 0x73, 0x61, 0x63,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x74, 0x72, 0x61, 0x6e,
	0x73, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x85, 0x01, 0x0a, 0x08, 0x53, 0x77, 0x61, 0x70,
	0x46, 0x61, 0x69, 0x6c, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x02, 0x69, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x5f,
	0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x49, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x5f, 0x63,
	0x6f, 0x64, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0d, 0x52, 0x0b, 0x66, 0x61, 0x69, 0x6c, 0x75,
	0x72, 0x65, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x27, 0x0a, 0x0f, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72,
	0x65, 0x5f, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0e, 0x66, 0x61, 0x69, 0x6c, 0x75, 0x72, 0x65, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x42,
	0x39, 0x5a, 0x37, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x74, 0x64,
	0x65, 0x78, 0x2d, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2f, 0x74, 0x64, 0x65, 0x78, 0x2d,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74,
	0x65, 0x64, 0x2f, 0x67, 0x6f, 0x2f, 0x73, 0x77, 0x61, 0x70, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_swap_proto_rawDescOnce sync.Once
	file_swap_proto_rawDescData = file_swap_proto_rawDesc
)

func file_swap_proto_rawDescGZIP() []byte {
	file_swap_proto_rawDescOnce.Do(func() {
		file_swap_proto_rawDescData = protoimpl.X.CompressGZIP(file_swap_proto_rawDescData)
	})
	return file_swap_proto_rawDescData
}

var file_swap_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_swap_proto_goTypes = []interface{}{
	(*SwapRequest)(nil),  // 0: SwapRequest
	(*SwapAccept)(nil),   // 1: SwapAccept
	(*SwapComplete)(nil), // 2: SwapComplete
	(*SwapFail)(nil),     // 3: SwapFail
	nil,                  // 4: SwapRequest.InputBlindingKeyEntry
	nil,                  // 5: SwapRequest.OutputBlindingKeyEntry
	nil,                  // 6: SwapAccept.InputBlindingKeyEntry
	nil,                  // 7: SwapAccept.OutputBlindingKeyEntry
}
var file_swap_proto_depIdxs = []int32{
	4, // 0: SwapRequest.input_blinding_key:type_name -> SwapRequest.InputBlindingKeyEntry
	5, // 1: SwapRequest.output_blinding_key:type_name -> SwapRequest.OutputBlindingKeyEntry
	6, // 2: SwapAccept.input_blinding_key:type_name -> SwapAccept.InputBlindingKeyEntry
	7, // 3: SwapAccept.output_blinding_key:type_name -> SwapAccept.OutputBlindingKeyEntry
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_swap_proto_init() }
func file_swap_proto_init() {
	if File_swap_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_swap_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SwapRequest); i {
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
		file_swap_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SwapAccept); i {
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
		file_swap_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SwapComplete); i {
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
		file_swap_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SwapFail); i {
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
			RawDescriptor: file_swap_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_swap_proto_goTypes,
		DependencyIndexes: file_swap_proto_depIdxs,
		MessageInfos:      file_swap_proto_msgTypes,
	}.Build()
	File_swap_proto = out.File
	file_swap_proto_rawDesc = nil
	file_swap_proto_goTypes = nil
	file_swap_proto_depIdxs = nil
}
