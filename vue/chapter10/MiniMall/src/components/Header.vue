<template>
  <nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link active text-primary" to="/"
            >홈</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/products">상품목록</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/cart">장바구니</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>
<script>
export default {
  name: 'Header',
};
</script>
