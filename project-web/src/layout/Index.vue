<template>
  <el-container class="mycontainer">
    <el-aside width="auto" class="leftmenu">
      <menu-bar></menu-bar>
    </el-aside>
    <el-container>
      <el-header class="header">
        <Header></Header>
      </el-header>
      <el-main class="main">
        <div class="tabs">
          <Tabs class="tabs-content"></Tabs>
          <ColseTabs></ColseTabs>
        </div>
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>
<script setup lang="ts">
import Header from '@/layout/header/Header.vue'
import MenuBar from '@/layout/menu/MenuBar.vue'
import Tabs from '@/layout/tabs/Tabs.vue'
import ColseTabs from '@/layout/tabs/ColseTabs.vue'
</script>
<style lang="scss" scoped>
.mycontainer {
  height: 100%;
  .leftmenu {
    background-color: #304156;
  }
  .header {
    background-color: #009688;
    display: flex;
    align-items: center;
  }
  .main {
    padding: 0px;
    .tabs {
      display: flex;
      justify-content: space-between;
      flex-grow: 1;
      border-bottom: 1px solid #e4e7ed;
    }
    padding-right: 75px;
    .el-tabs {
      width: 100%;
      height: 33px;
    }
    .tabs-content {
      padding-top: 8px;
      padding-left: 10px;
      padding-right: 10px;
    }
  }
}
</style>
