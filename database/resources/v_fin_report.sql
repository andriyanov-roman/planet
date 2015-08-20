CREATE VIEW `v_fin_report` AS
Select o.order_date, u.login, p.name, o.product_qty ,o.amount
from order    o,
     product  p,
     user     u
where o.product_id = p.id
  and o.user_id    = u.id