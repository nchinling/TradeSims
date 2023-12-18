# TradeSims - Stock Trading Simulator

## Project Information

TradeSims is a stock trading simulator app that allows users to simulate buying and selling stocks. Users can check their trading profits (or losses) and perform charting. The app includes various charting technical indicators to aid users in identifying buy/sell signals. Other features include a listing of trade history and the current cash-to-stocks ratio.

TradeSims is hosted at [https://tradesims.up.railway.app/](https://tradesims.up.railway.app/).

### Features and Technology Used

- Angular (TypeScript)
- Spring Boot (Java)
- Financial data (web API)
- Chart JS
- Bootstrap

## Usage

### Dashboard

The dashboard provides an overview of the user's trading performance, including total profit (loss) in absolute terms and percentage. Doughnut charts display data on the user's cash-to-stock ratio and the proportion of different stocks in the portfolio. The table presents data on the performance of each trade, and users can view their trade history on the dashboard.

### Charting

Users can view stock charts of listed companies (limited to US stocks). They can zoom in or out to view fewer or more data points respectively.

Users are provided with various technical indicators with their charts to aid them in making trading decisions.


### Buy/Sell Orders

Users place buy/sell orders by providing the number of units and the buy/sell action. The order will be executed using stock prices accurate to 1 minute.


### Company Information

Users can search for company data using the search bar.

### Using TradeSims
Although the codes are available for your perusal, the app requires the use of environment variables and keys such as from the financial data service provider. Therefore it would be challenging to run the downloaded codes on your localhost. The app can be accessed at at https://tradesims.up.railway.app/


## How to Use TradeSims (hosted at [https://tradesims.up.railway.app/](https://tradesims.up.railway.app/))

On login, users will be directed to the dashboard, where they can view their cash-to-stock ratio and the proportion of different stocks in the portfolio.

1. **Dashboard**: Total profit (loss) in absolute terms and percentage, cash-to-stock ratio, and stock proportions. The table presents data on the performance of each trade.

2. **Charting**: View stock charts of listed companies (limited to US stocks). Zoom in or out to view fewer or more data points.

3. **Buy/Sell Orders**: Place buy/sell orders by providing the number of units and the buy/sell action.

4. **Company Information**: Search for company data using the search bar.

