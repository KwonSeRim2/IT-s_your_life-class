import { createRouter, createWebHistory } from 'vue-router';
//처음에만 home 로드
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
import VideoPlayer from '@/pages/VideoPlayer.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',

      component: About,
    },
    {
      path: '/members',
      name: 'members',

      component: Members,
    },
    {
      path: '/videos',

      name: 'videos',

      component: Videos,

      children: [{ path: ':id', name: 'vidios/id', component: VideoPlayer }],
    },
    {
      path: '/members/:id',
      name: '/members/:id',
      component: MemberInfo,
    },
  ],
});

export default router;
