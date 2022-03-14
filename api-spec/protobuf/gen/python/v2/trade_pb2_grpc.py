# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from v2 import trade_pb2 as v2_dot_trade__pb2


class TradeStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Markets = channel.unary_unary(
                '/tdextrade.v2.Trade/Markets',
                request_serializer=v2_dot_trade__pb2.MarketsRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.MarketsReply.FromString,
                )
        self.Balances = channel.unary_unary(
                '/tdextrade.v2.Trade/Balances',
                request_serializer=v2_dot_trade__pb2.BalancesRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.BalancesReply.FromString,
                )
        self.MarketPrice = channel.unary_unary(
                '/tdextrade.v2.Trade/MarketPrice',
                request_serializer=v2_dot_trade__pb2.MarketPriceRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.MarketPriceReply.FromString,
                )
        self.TradePropose = channel.unary_stream(
                '/tdextrade.v2.Trade/TradePropose',
                request_serializer=v2_dot_trade__pb2.TradeProposeRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.TradeProposeReply.FromString,
                )
        self.ProposeTrade = channel.unary_unary(
                '/tdextrade.v2.Trade/ProposeTrade',
                request_serializer=v2_dot_trade__pb2.ProposeTradeRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.ProposeTradeReply.FromString,
                )
        self.TradeComplete = channel.unary_stream(
                '/tdextrade.v2.Trade/TradeComplete',
                request_serializer=v2_dot_trade__pb2.TradeCompleteRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.TradeCompleteReply.FromString,
                )
        self.CompleteTrade = channel.unary_unary(
                '/tdextrade.v2.Trade/CompleteTrade',
                request_serializer=v2_dot_trade__pb2.CompleteTradeRequest.SerializeToString,
                response_deserializer=v2_dot_trade__pb2.CompleteTradeReply.FromString,
                )


class TradeServicer(object):
    """Missing associated documentation comment in .proto file."""

    def Markets(self, request, context):
        """Markets: List all the markets open for trading.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Balances(self, request, context):
        """Balances: Gets the balances of the two current reserves in the given
        market.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MarketPrice(self, request, context):
        """MarketPrice: Gets the current market price. In case of AMM startegy, the
        trade type and
        the amount of asset to be either sent or received.

        BUY = quote asset as input
        SELL = base asset as input

        If the type of the trade is BUY it means the base asset will be received by
        the trader.

        If the type of the trade is SELL it means the base asset will be sent by
        the trader.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TradePropose(self, request, context):
        """DEPRECATED TradePropose: Sends a swap request message containing a partial signed
        transaction.

        BUY = quote asset as input
        SELL = base asset as input


        If the type of the trade is BUY it means the base asset will be received by
        the trader.

        If the type of the trade is SELL it means the base asset will be sent by
        the trader.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ProposeTrade(self, request, context):
        """Unary RPC for TradePropose.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def TradeComplete(self, request, context):
        """DEPRECATED TradeComplete: Sends the trader's counter-signed transaction to the
        provider. If something wrong, a swap fail message is sent. It returns the
        transaction hash of the broadcasted transaction.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CompleteTrade(self, request, context):
        """Unary RPC for TradeComplete.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_TradeServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Markets': grpc.unary_unary_rpc_method_handler(
                    servicer.Markets,
                    request_deserializer=v2_dot_trade__pb2.MarketsRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.MarketsReply.SerializeToString,
            ),
            'Balances': grpc.unary_unary_rpc_method_handler(
                    servicer.Balances,
                    request_deserializer=v2_dot_trade__pb2.BalancesRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.BalancesReply.SerializeToString,
            ),
            'MarketPrice': grpc.unary_unary_rpc_method_handler(
                    servicer.MarketPrice,
                    request_deserializer=v2_dot_trade__pb2.MarketPriceRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.MarketPriceReply.SerializeToString,
            ),
            'TradePropose': grpc.unary_stream_rpc_method_handler(
                    servicer.TradePropose,
                    request_deserializer=v2_dot_trade__pb2.TradeProposeRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.TradeProposeReply.SerializeToString,
            ),
            'ProposeTrade': grpc.unary_unary_rpc_method_handler(
                    servicer.ProposeTrade,
                    request_deserializer=v2_dot_trade__pb2.ProposeTradeRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.ProposeTradeReply.SerializeToString,
            ),
            'TradeComplete': grpc.unary_stream_rpc_method_handler(
                    servicer.TradeComplete,
                    request_deserializer=v2_dot_trade__pb2.TradeCompleteRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.TradeCompleteReply.SerializeToString,
            ),
            'CompleteTrade': grpc.unary_unary_rpc_method_handler(
                    servicer.CompleteTrade,
                    request_deserializer=v2_dot_trade__pb2.CompleteTradeRequest.FromString,
                    response_serializer=v2_dot_trade__pb2.CompleteTradeReply.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'tdextrade.v2.Trade', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Trade(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def Markets(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/tdextrade.v2.Trade/Markets',
            v2_dot_trade__pb2.MarketsRequest.SerializeToString,
            v2_dot_trade__pb2.MarketsReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Balances(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/tdextrade.v2.Trade/Balances',
            v2_dot_trade__pb2.BalancesRequest.SerializeToString,
            v2_dot_trade__pb2.BalancesReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MarketPrice(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/tdextrade.v2.Trade/MarketPrice',
            v2_dot_trade__pb2.MarketPriceRequest.SerializeToString,
            v2_dot_trade__pb2.MarketPriceReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TradePropose(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/tdextrade.v2.Trade/TradePropose',
            v2_dot_trade__pb2.TradeProposeRequest.SerializeToString,
            v2_dot_trade__pb2.TradeProposeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ProposeTrade(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/tdextrade.v2.Trade/ProposeTrade',
            v2_dot_trade__pb2.ProposeTradeRequest.SerializeToString,
            v2_dot_trade__pb2.ProposeTradeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def TradeComplete(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(request, target, '/tdextrade.v2.Trade/TradeComplete',
            v2_dot_trade__pb2.TradeCompleteRequest.SerializeToString,
            v2_dot_trade__pb2.TradeCompleteReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CompleteTrade(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/tdextrade.v2.Trade/CompleteTrade',
            v2_dot_trade__pb2.CompleteTradeRequest.SerializeToString,
            v2_dot_trade__pb2.CompleteTradeReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
