package tradesims.project.tradesimsbackend.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import org.springframework.jdbc.core.RowMapper;

import tradesims.project.tradesimsbackend.models.Trade;

public class TradeRowMapper implements RowMapper<Trade> {
    @Override
    public Trade mapRow(ResultSet rs, int rowNum) throws SQLException {

        Trade trade = new Trade();
        trade.setAccountId(rs.getString("account_id"));
        trade.setUsername(rs.getString("username"));
        trade.setExchange(rs.getString("exchange"));
        trade.setSymbol(rs.getString("symbol"));
        trade.setStockName(rs.getString("stock_name"));
        trade.setUnits(rs.getDouble("units"));
        trade.setPrice(rs.getDouble("price"));
        Date buyDate = rs.getDate("trade_date");
        trade.setDate(buyDate.toLocalDate());
        trade.setCurrency(rs.getString("currency"));
        trade.setAction(rs.getString("action"));
  
        trade.setTotal(rs.getDouble("total"));
        return trade;
    }
}



