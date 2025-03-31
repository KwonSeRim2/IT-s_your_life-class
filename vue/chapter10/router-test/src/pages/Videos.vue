<template>
  <div class="card card-body">
    <h2 class="m-3">영상 리스트</h2>
    <ul class="List-group">
      <li v-for="(v, index) in videos" :key="index">
        {{.title}} ({{ v.category }})
        <router-link :to="{ name: 'video/id', params: { id: v.id } }">
          <span class="float-end badge bg-secondary">듣기</span>
        </router-link>
      </li>
    </ul>
  </div>
</template>
<script>
import { useRoute } from 'vue-router';


export default {
  name: 'Videoaplayer',
  components: {youtubeVue3},
  setup({

    const stopVideo = ()=> {
        playerFef.value.player.stopVideo()
        router.push({name: 'videos'})
    }
  })
};
</script>
