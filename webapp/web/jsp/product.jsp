<html>
<jsp:useBean id="product" class="planet.entity.Product" scope="request"/>
<head>
  <title>Product page</title>
</head>
<body>

<h1><jsp:getProperty name="product" property="name"/></h1>

<h3><jsp:getProperty name="product" property="price"/></h3>

</body>
</html>