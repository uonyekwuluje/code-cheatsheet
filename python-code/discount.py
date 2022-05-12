
price = 250
if price >= 300:
    discount = (price * (30/100))
elif price >= 200 or price <= 299:
    discount = (price * (20/100))
elif price >= 100 or price <= 199:
    discount = (price * (10/100))
elif price >= 1 or price <= 99:
    discount = (price * (5/100))
else:
    discount = 0

price = price - discount

print("The Price => ", price)
